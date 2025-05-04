package org.example.part1;

import org.example.PasswordGenerator;

public class WrongFixedPasswordGenerator implements PasswordGenerator {

    @Override
    public String generatePassword(){
        return "ab";
    }
}
