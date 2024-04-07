package com.example.demo2.util;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;
import java.util.Random;


public class SendMailNumber {

    private String sendMailer;
    private String password;

    @Getter
    private String authNumber;
    public SendMailNumber() {
        this.sendMailer = Util.sendMailer;
        this.password = Util.password;
    }


    //인증 메일 보내기.
    public boolean sendMailNumber(String useremail){

        // SMTP 서버 정보 설정
        Properties props = new Properties();

        props.put("mail.smtp.ssl.protocols", "TLSv1.2");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");

// 세션 생성

        try {
            Session session = Session.getInstance(props, new Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(sendMailer, password);
                }
            });

// 메시지 생성
            //System.out.println("sendMailer: " + sendMailer);
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(sendMailer));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(useremail));
            message.setSubject("회원가입 인증 메일");

// 인증번호 생성 및 메시지 내용 설정
            this.authNumber = generateAuthNumber();
            message.setText("회원가입 인증번호: " + authNumber);

// 메시지 전송
            Transport.send(message);
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }

    //6자리 인증번호 생성
    private String generateAuthNumber() {
        Random random = new Random();
        StringBuilder authNumber = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            authNumber.append(random.nextInt(10));
        }

        return authNumber.toString();
    }

}
