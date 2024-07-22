package com.example.demo2.util;

public class Util {


    // JDBC URL, username and password of MySQL server
    public static final String URL = "jdbc:mysql://localhost:3306/example0?useSSL=false&useUnicode=true&serverTimezone=Asia/Seoul";
    public static final String USERNAME = "admin0";
    public static final String PASSWORD = "1234";


    // 파일 저장 위치 : 끝에 \\를 붙여야 됨.
    public static final String dataFPath = "d:\\uploadData\\";

    // 문의처

    public static final String contactCompany = "Company Name";
    public static final String contactTel = "010-1234-5678";
    public static final String contactEmail = "email@example.com";
    public static String SaveEmail;


    // 메일 발송용
    // https://blog.naver.com/tt2t2am1118/223520863617 참조해보세요. [프로그래밍] 구글 메일 설정~. SMTP 서버 사용해보기. 메일~.
    static String sendMailer = "";  //이 부분을 수정하면 보낸 메일을 보낼 수 있습니다. ex) 구글 메일형식. example@gmail.com
    static String password = "";  //메일보낼 때에 암호입력. 메일보내기를 공부해보세요~. 작동 됨니다.





}
