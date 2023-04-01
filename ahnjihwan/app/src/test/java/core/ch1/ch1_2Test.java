package core.ch1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ch1_2Test {
    public ch1_2 example;

    @BeforeEach
    void setUp() {
        example = new ch1_2();
    }

    @Test
    public void result() {
        assertThat(example.solveAngle(1)).isEqualTo(1);
        assertThat(example.solveAngle(2)).isEqualTo(2);
        assertThat(example.solveAngle(3)).isEqualTo(3);
        assertThat(example.solveAngle(4)).isEqualTo(4);
        assertThat(example.solveAngle(5)).isEqualTo(5);
        assertThat(example.solveAngle(6)).isEqualTo(6);
        assertThat(example.solveAngle(7)).isEqualTo(7);
        assertThat(example.solveAngle(8)).isEqualTo(8);
        assertThat(example.solveAngle(9)).isEqualTo(9);
        assertThat(example.solveAngle(10)).isEqualTo(10);
        assertThat(example.solveAngle(11)).isEqualTo(11);
    }
}
