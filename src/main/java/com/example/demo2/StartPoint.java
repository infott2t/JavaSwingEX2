package com.example.demo2;


import com.example.demo2.screen.LoginScreen;
import com.example.demo2.screen.StaticTable;
import com.formdev.flatlaf.FlatDarculaLaf;

public class StartPoint {

    public static void main(String[] args) {

        //FlatLightLaf.setup();
        //FlatDarkLaf.setup();
        //FlatIntelliJLaf.setup();
        FlatDarculaLaf.setup();
        StaticTable.loginScreen = new LoginScreen();
    }
}
