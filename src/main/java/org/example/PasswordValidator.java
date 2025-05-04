package org.example;

public class PasswordValidator {

    private static final String WRONG_PASSWORD_LENGTH_EXCEPTION = "비밀번호는 최소 8자 이상 12자 이하여야 한다.";

    public static void validate(String pwd) {
        int length = pwd.length();
        if(length < 8 || length > 12){
            throw new IllegalArgumentException(WRONG_PASSWORD_LENGTH_EXCEPTION);
        }
    }

}
