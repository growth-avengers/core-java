package ch01;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class ch01_1Test {

    @Test
    void intToRadix() {
        assertThat(ch01_1.intToRadix(1, "binary")).isEqualTo("1");
    }
}