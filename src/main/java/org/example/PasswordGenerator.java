package org.example;

@FunctionalInterface
// 함수가 하나인 인터페이스를 정의할 때는 @FunctionalInterface를 붙여주면 좋다.
public interface PasswordGenerator {

    String generatePassword();
}
