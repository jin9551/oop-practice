package org.example;

public class User {
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void initPassword(PasswordGenerator passwordGenerator){
        // as-is
        //RandomPasswordGenerator randomPasswordGenerator = new RandomPasswordGenerator();

        // to-be
        String randaomPassword = passwordGenerator.generatePassword();

        if(randaomPassword.length() >= 8 && randaomPassword.length() <=12 ){
            this.password = randaomPassword;
        }
    }
}
