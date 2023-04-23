package ch01;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class ch01_9Test {
    @Test
    void equal() {
        String input = "Hello";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ch01_9.equal();
    }
}