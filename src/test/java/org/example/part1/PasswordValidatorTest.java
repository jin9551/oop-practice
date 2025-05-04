package org.example.part1;

import org.example.PasswordValidator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatCode;

/*
* 비밀번호는 최소 8자 이상 12자 이하여야 한다.
* 비밀번호가 8자 미만 또는 12자 초과인 경우 IllegalArgumentException 예외를 발생시킨다.
* 경계조건에 대해 테스트 코드를 작성해야 한다.
* */
public class PasswordValidatorTest {

    
    @DisplayName("비밀번호는 최소 8자 이상 12자 이하면 예외가 발생하지 않는다.") // 테스트의 의미를 표현해주는 어노테이션
    @Test
    void validatePasswordTest() {
        assertThatCode(() -> PasswordValidator.validate("serverwizard"))
                .doesNotThrowAnyException();
    }

    @DisplayName("비밀번호가 8자 미만 또는 12자 초과인 경우 예외가 발생한다.")
    @ParameterizedTest //경계조건에 대해 테스트 코드를 작성해야 한다.
    @ValueSource(strings = {"aabbcce","aabbccddeeffg"}) // 7자 13자
    void validatePasswordTest2(String password) {
        assertThatCode(() -> PasswordValidator.validate(password))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("비밀번호는 최소 8자 이상 12자 이하여야 한다.");
    }


}
