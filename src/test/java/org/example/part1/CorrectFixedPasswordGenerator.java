package org.example.part1;

import org.example.PasswordGenerator;

public class CorrectFixedPasswordGenerator implements PasswordGenerator {

    @Override
    public String generatePassword(){
        return "abcdefgh";
    }
}
