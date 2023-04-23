package ch01;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ch01_2Test {

    @Test
    void normalizeAngle() {
        assertThat(ch01_2.normalizeAngle(30)).isEqualTo(30);
        assertThat(ch01_2.normalizeAngle(380)).isEqualTo(20);
        assertThat(ch01_2.normalizeAngle(-60)).isEqualTo(300);
    }
}