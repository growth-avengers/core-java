package ch01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class ch01_3Test {

    @Test
    void maxOperator() {
        assertThat(ch01_3.maxOperator(1,2,3)).isEqualTo(3);
        assertThat(ch01_3.maxOperator(2,2,1)).isEqualTo(2);
    }

    @Test
    void maxMath() {
        assertThat(ch01_3.maxMath(1,2,3)).isEqualTo(3);
        assertThat(ch01_3.maxMath(2,2,1)).isEqualTo(2);
    }
}