package com.example.demo2.screen;

import com.example.demo2.screen.help.HelpScreen;

public class StaticTable {

    public static HelpScreen helpScreen;
    static UserInfoScreen userInfoScreen;
    static ChooseValue chooseValue;

    public static LoginScreen loginScreen;

    public static EntitiesScreen entitiesScreen;

    static StatusScreen statusScreen;

    static EntitySearchScreen entitySearchScreen;

    public StaticTable(UserInfoScreen userInfoScreen) {
         userInfoScreen = new UserInfoScreen("userInfo");
    }
}
