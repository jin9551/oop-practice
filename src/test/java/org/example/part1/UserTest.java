package org.example.part1;

import org.example.RandomPasswordGenerator;
import org.example.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class UserTest {

    @DisplayName("패스워드를 초기화한다")
    @Test
    void passwordTest() {
        User user = new User();
        // 이렇게 구현해도 되지만
        //user.initPassword(new CorrectFixedPasswordGenerator());
        //user.initPassword(new RandomPasswordGenerator());
        user.initPassword(()->"abcdefgh"); // 람다식으로 구현해도 됨
        //user.initPassword();
        assertThat(user.getPassword()).isNotNull();
    }

    @DisplayName("패스워드가 요구사항에 부합하지 않아 초기화가 되지 않는다.")
    @Test
    void passwordTest2() {
        User user = new User();
        user.initPassword(new WrongFixedPasswordGenerator());
        assertThat(user.getPassword()).isNull();
    }
}