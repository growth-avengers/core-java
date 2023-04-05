package ch01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class ch01_10Test {

    @Test
    void longTo36redix() {
        long number = 1234567890L;
        assertThat(ch01_10.longTo36redix(number)).isEqualTo("kf12oi");
    }
}