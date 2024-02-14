package com.example.netclanexplorer;

public class Constants {
    public static String getCharOfFirstAndSurname(String userName) {
        String[] nameParts=userName.split(" ");
        char   firstCharOfFirstName=nameParts[0].charAt(0);
        if (nameParts.length>=2){
            char firstCharOfSurname=nameParts[1].charAt(0);
            return String.valueOf(firstCharOfFirstName) + String.valueOf(firstCharOfSurname);
        }else {
            return String.valueOf(firstCharOfFirstName);
        }
    }
}
