package core.ch01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.security.InvalidParameterException;

import static core.ch01.P1.parseIntInTheRadix;
import static org.assertj.core.api.Assertions.assertThat;

class P1Test {

    @Test
    void convertBinary() {
        assertThat(parseIntInTheRadix(8, 2)).isEqualTo("1000");
    }

    @Test
    void convertOctal() {
        assertThat(parseIntInTheRadix(8, 8)).isEqualTo("10");
    }

    @Test
    void convertHex() {
        assertThat(parseIntInTheRadix(8, 16)).isEqualTo("8");
    }

    @ParameterizedTest
    @ValueSource(ints = {-3, 5, 10, 17})
    void getExpectedException(int radix) {
        Assertions.assertThrowsExactly(InvalidParameterException.class, () -> parseIntInTheRadix(8, radix));
    }

}
