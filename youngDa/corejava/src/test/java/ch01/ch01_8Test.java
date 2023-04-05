package ch01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;


class ch01_8Test {
    @Test
    void printString() {
        assertThat(ch01_8.printString("test str")).isEqualTo("teststr");
    }
}