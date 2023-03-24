package core.ch1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

// 정수를 읽어서 2진수, 8진수, 16진수로 출력하는 프로그램을 작성하라.
class Example01Test {
    Example01 example;

    @BeforeEach
    void setUp() {
        example = new Example01();
    }

    @Test
    public void result_binaryNumber() {
        assertThat(example.binaryNumber(1)).isEqualTo("1");
        assertThat(example.binaryNumber(2)).isEqualTo("10");
        assertThat(example.binaryNumber(3)).isEqualTo("11");
        assertThat(example.binaryNumber(4)).isEqualTo("100");
    }

    @Test
    public void result_octalNumber() {
        assertThat(example.octalNumber(1)).isEqualTo("1");
        assertThat(example.octalNumber(2)).isEqualTo("2");
        assertThat(example.octalNumber(3)).isEqualTo("3");
        assertThat(example.octalNumber(4)).isEqualTo("4");
        assertThat(example.octalNumber(5)).isEqualTo("5");
        assertThat(example.octalNumber(6)).isEqualTo("6");
        assertThat(example.octalNumber(7)).isEqualTo("7");
        assertThat(example.octalNumber(8)).isEqualTo("10");
        assertThat(example.octalNumber(16)).isEqualTo("20");
        assertThat(example.octalNumber(28)).isEqualTo("34");
    }
}
