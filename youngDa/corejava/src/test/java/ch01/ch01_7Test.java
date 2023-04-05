package ch01;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class ch01_7Test {

    @Test
    void calcualtor() {
        String input = "4294967295 2";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        assertThat(ch01_7.Calcualtor("*")).isEqualTo("8589934590");
    }
}