package core.ch1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ch1_4Test {

    ch1_4 example;

    @BeforeEach
    void setUp() {
        example = new ch1_4();
    }

    @Test
    public void return_MAX() {
        assertThat(example.result_MAX(0.0)).isEqualTo(4.9E-324);
    }

    @Test
    public void return_MIN() {
        assertThat(example.result_MIN()).isEqualTo(1.7976931348623157E308);
    }
}
