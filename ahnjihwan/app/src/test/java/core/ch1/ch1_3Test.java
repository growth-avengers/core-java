package core.ch1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ch1_3Test {
    ch1_3 example;

    @BeforeEach
    void setUp() {
        example = new ch1_3();
    }

    @Test
    public void result_MAX() {
        assertThat(example.returnMax(2, 1, 3)).isEqualTo(3);
        assertThat(example.returnMax(1, 2, 3)).isEqualTo(3);
        assertThat(example.returnMax(3, 2, 1)).isEqualTo(3);
    }

    @Test
    public void result_Conditional() {
        assertThat(example.returnConditional(1, 2, 1)).isEqualTo(2);
        assertThat(example.returnConditional(1, 2, 3)).isEqualTo(3);
        assertThat(example.returnConditional(2, 4, 3)).isEqualTo(4);
        assertThat(example.returnConditional(3, 2, 1)).isEqualTo(3);
    }

}
