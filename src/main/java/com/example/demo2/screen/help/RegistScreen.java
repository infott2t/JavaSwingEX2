/*
 * Created by JFormDesigner on Sat Mar 09 18:25:06 KST 2024
 */

package com.example.demo2.screen.help;

import com.example.demo2.domain.UserInfo;
import com.example.demo2.domain.UserInfoDAO;
import com.example.demo2.util.ChkValidate;
import com.example.demo2.util.SendMailNumber;
import com.example.demo2.util.Util;
import com.formdev.flatlaf.FlatLightLaf;
import org.mindrot.jbcrypt.BCrypt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.util.TimerTask;
import javax.swing.*;
import javax.swing.border.*;

/**
 * @author ee323
 *
 * System.out.println 부분, 지워야할 부분 200번째줄.    System.out.println("인증번호: " + authNumber);
 */
public class RegistScreen extends JFrame {

    String role;

    boolean mailChk = false;
    boolean authNumberSended = false;

    String authNumber;

    String inputEmail;

    public RegistScreen() {
        initComponents();
    }

    public RegistScreen(String role) {
        this.role = role;
        initComponents();


    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Hyeonil
        panel3 = new JPanel();
        panel1 = new JPanel();
        panel2 = new JPanel();
        label3 = new JLabel();
        textField2 = new JTextField();
        button1 = new JButton();
        label4 = new JLabel();
        textField3 = new JTextField();
        label5 = new JLabel();
        passwordField1 = new JPasswordField();
        passwordField2 = new JPasswordField();
        panel4 = new JPanel();
        button2 = new JButton();
        panel5 = new JPanel();

        //======== this ========
        setTitle("\ud68c\uc6d0\ub4f1\ub85d - "+ role);
        var contentPane = getContentPane();
        contentPane.setLayout(new GridBagLayout());
        ((GridBagLayout)contentPane.getLayout()).columnWidths = new int[] {0, 0};
        ((GridBagLayout)contentPane.getLayout()).rowHeights = new int[] {0, 0, 0};
        ((GridBagLayout)contentPane.getLayout()).columnWeights = new double[] {1.0, 1.0E-4};
        ((GridBagLayout)contentPane.getLayout()).rowWeights = new double[] {0.0, 0.0, 1.0E-4};

        //======== panel3 ========
        {
            panel3.setBorder(new EmptyBorder(10, 10, 10, 10));

            panel3.setLayout(new GridBagLayout());
            ((GridBagLayout)panel3.getLayout()).columnWidths = new int[] {0, 0};
            ((GridBagLayout)panel3.getLayout()).rowHeights = new int[] {0, 0, 0};
            ((GridBagLayout)panel3.getLayout()).columnWeights = new double[] {1.0, 1.0E-4};
            ((GridBagLayout)panel3.getLayout()).rowWeights = new double[] {1.0, 1.0, 1.0E-4};

            //======== panel1 ========
            {
                panel1.setBorder(new TitledBorder("User Info"));
                panel1.setLayout(new GridBagLayout());
                ((GridBagLayout)panel1.getLayout()).columnWidths = new int[] {0, 0};
                ((GridBagLayout)panel1.getLayout()).rowHeights = new int[] {0, 0};
                ((GridBagLayout)panel1.getLayout()).columnWeights = new double[] {1.0, 1.0E-4};
                ((GridBagLayout)panel1.getLayout()).rowWeights = new double[] {0.0, 1.0E-4};

                //======== panel2 ========
                {
                    panel2.setBorder(new EmptyBorder(10, 10, 10, 10));
                    panel2.setLayout(new GridBagLayout());
                    ((GridBagLayout)panel2.getLayout()).columnWidths = new int[] {0, 0, 0, 0};
                    ((GridBagLayout)panel2.getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0};
                    ((GridBagLayout)panel2.getLayout()).columnWeights = new double[] {0.0, 1.0, 0.0, 1.0E-4};
                    ((GridBagLayout)panel2.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 1.0E-4};

                    //---- label3 ----
                    label3.setText("E-Mail:");
                    panel2.add(label3, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 10, 10), 0, 0));
                    panel2.add(textField2, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 10, 10), 0, 0));

                    //---- button1 ----
                    button1.setText("\uc778\uc99d \ubc88\ud638\ubc1b\uae30");
                    panel2.add(button1, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 10, 0), 0, 0));

                    //---- label4 ----
                    label4.setText("\uc778\uc99d\ubc88\ud638:");
                    panel2.add(label4, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 10, 10), 0, 0));
                    panel2.add(textField3, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 10, 10), 0, 0));

                    //---- label5 ----
                    label5.setText("Password:");
                    panel2.add(label5, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 10, 10), 0, 0));
                    panel2.add(passwordField1, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 10, 10), 0, 0));
                    panel2.add(passwordField2, new GridBagConstraints(1, 3, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 10), 0, 0));
                }
                panel1.add(panel2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 0), 0, 0));
            }
            panel3.add(panel1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 10, 0), 0, 0));

            //======== panel4 ========
            {
                panel4.setLayout(new BorderLayout());

                //---- button2 ----
                button2.setText("\ud68c\uc6d0 \ub4f1\ub85d");
                panel4.add(button2, BorderLayout.EAST);

                //======== panel5 ========
                {
                    panel5.setLayout(new GridBagLayout());
                    ((GridBagLayout)panel5.getLayout()).columnWidths = new int[] {0, 0};
                    ((GridBagLayout)panel5.getLayout()).rowHeights = new int[] {0, 0};
                    ((GridBagLayout)panel5.getLayout()).columnWeights = new double[] {0.0, 1.0E-4};
                    ((GridBagLayout)panel5.getLayout()).rowWeights = new double[] {0.0, 1.0E-4};
                }
                panel4.add(panel5, BorderLayout.WEST);
            }
            panel3.add(panel4, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 0), 0, 0));
        }
        contentPane.add(panel3, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 0, 0), 0, 0));
        setSize(400, 280);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
        setVisible(true);

        button1.addActionListener(e -> {
            String email = textField2.getText();
            if(email.equals("")){
                JOptionPane.showMessageDialog(null, "이메일을 입력해주세요.");

            }else if(!ChkValidate.isEmail(email)){
                JOptionPane.showMessageDialog(null, "이메일 형식이 아닙니다.");
            }else{
                //메일 중복확인. UserInfo
                UserInfoDAO userInfoDAO = new UserInfoDAO();
                UserInfo userInfo = userInfoDAO.findByEmail(email);
                SendMailNumber mailNumber = new SendMailNumber();
                if(userInfo != null) {
                    JOptionPane.showMessageDialog(null, "이미 가입된 이메일입니다.");
                }else{
                    if(!authNumberSended){

                        //System.out.println(email);
                        boolean success= mailNumber.sendMailNumber(email);
                        if(success){
                            JOptionPane.showMessageDialog(null, "인증번호가 발송되었습니다. 인증번호를 입력해주세요.");
                            inputEmail = email;
                            authNumber = mailNumber.getAuthNumber();
                            System.out.println("인증번호: " + authNumber);
                            authNumberSended = true;
                            mailChk= true;

                        }else{
                            JOptionPane.showMessageDialog(null, "인증번호 발송에 실패했습니다. 다시 시도해주세요.");
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "이미 인증번호가 발송되었습니다. 3분 뒤에 재 발송가능합니다.");
                        Timer timer = new Timer(180000, new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                authNumberSended = false;
                            }
                        });
                        timer.setRepeats(false); // Timer should only go off once
                        timer.start();

                    }


                }


            }

        }); //button1 end

        button2.addActionListener(e -> {
            if (mailChk) {

                String authNumberInput = textField3.getText();

                //password가 동일한지 비교.
                if(!new String(passwordField1.getPassword()).equals(new String(passwordField2.getPassword()))){
                    JOptionPane.showMessageDialog(null, "비밀번호가 일치하지 않습니다.");
                    return;
                }else{
                    //password가 4자리 이상인지 비교.
                    if(!ChkValidate.isPassword(new String(passwordField1.getPassword()))){
                        JOptionPane.showMessageDialog(null, "비밀번호는 4자리 이상이어야 합니다.");
                        return;
                    }else{
                        if(!authNumber.equals(authNumberInput)){
                            JOptionPane.showMessageDialog(null, "인증번호가 일치하지 않습니다.");
                            return;
                        }else{
                            //UserInfo의 마지막 id값을 구한다.
                            UserInfoDAO userInfoDAO = new UserInfoDAO();
                            UserInfo userInfoId = userInfoDAO.findLastId();
                            long id = userInfoId.getId() + 1L;


                            //inputEmail, passwordField1, role 로 회원을 등록. insert into UserInfo.
                            UserInfo userInfo = new UserInfo();
                            userInfo.setId(id);
                            userInfo.setEmail(inputEmail);
                            //password는, Bcrypt로 암호화.
                            String pw = new String(passwordField1.getPassword());
                            String hashPW = BCrypt.hashpw(pw, BCrypt.gensalt());
                            userInfo.setPassword(hashPW);
                            userInfo.setRole(role);
                            userInfo.setIsDel("N");

                            userInfoDAO = new UserInfoDAO();
                            userInfoDAO.insert(userInfo);
                            JOptionPane.showMessageDialog(null, "회원가입이 완료되었습니다. 로그인 해주세요.");
                            dispose();

                        }
                    }

                }


            } else {
                JOptionPane.showMessageDialog(null, "이메일 인증을 해주세요.");
            }
        });
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Hyeonil
    private JPanel panel3;
    private JPanel panel1;
    private JPanel panel2;
    private JLabel label3;
    private JTextField textField2;
    private JButton button1;
    private JLabel label4;
    private JTextField textField3;
    private JLabel label5;
    private JPasswordField passwordField1;
    private JPasswordField passwordField2;
    private JPanel panel4;
    private JButton button2;
    private JPanel panel5;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on


}
