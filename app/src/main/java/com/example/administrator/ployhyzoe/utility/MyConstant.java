package com.example.administrator.ployhyzoe.utility;

/**
 * Created by Administrator on 22/3/2561.
 */

public class MyConstant {
//    About URL
    private  String urlGetalluserString = "http://androidthai.in.th/mar/getAllUser.php";
    private String urlPostuserString = "http://androidthai.in.th/mar/postUser.php";

//    about array
    private String[] LoginStrings = new String[]{"id","Name","User","Password"};

    public String[] getLoginStrings() {
        return LoginStrings;
    }

    public String getUrlGetalluserString() {
        return urlGetalluserString;
    }

    public String getUrlPostuserString() {
        return urlPostuserString;
    }
}  //Main class

