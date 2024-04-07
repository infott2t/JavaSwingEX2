package com.example.demo2.util;

public class ChkValidate {

        public static boolean isEmail(String email) {
            if (email == null) return false;
            return email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$");
        }


    /*
       암호 조건,
        최소한 하나의 알파벳 문자(A-Z, a-z)를 포함해야 합니다.
        최소한 하나의 숫자(0-9)를 포함해야 합니다.
        총 길이는 최소 8자 이상이어야 합니다.
    */
        public static boolean isPassword0(String password) {
            if (password == null) return false;
            return password.matches("^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$");
        }

        public static boolean isPassword(String password) {
            if (password == null) return false;
            return password.matches(".{4,}$");
        }

        public static boolean isTel(String tel) {
            if (tel == null) return false;
            return tel.matches("^01(?:0|1|[6-9])-(?:\\d{3}|\\d{4})-\\d{4}$");
        }

        public static boolean isAddr(String addr) {
            if (addr == null) return false;
            return addr.matches("^[가-힣]{2,4}시 [가-힣]{2,4}구 [가-힣]{2,4}동 [가-힣]{2,4}로 [0-9]{1,4}-[0-9]{1,4}$");
        }

        public static boolean isRole(String role) {
            if (role == null) return false;
            return role.matches("^[a-zA-Z]{4,6}$");
        }
}
