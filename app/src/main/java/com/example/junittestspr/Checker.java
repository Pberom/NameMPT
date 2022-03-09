package com.example.junittestspr;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Checker {
    public boolean checkLogin(String login){
        if(!login.matches("^[a-zA-Z0-9_]+$") || login.length() < 3)
        {
            return false;
        }
        else
            return true;
    }

    public static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    public boolean checkEmail(String mail) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(mail);
        return matcher.find();
    }

    public boolean checkPassword(String password){
        String pattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&+=])(?=\\S+$).{8,}";
        if(!password.matches(pattern))
        {
            return false;
        }
        else
            return true;
    }
}
