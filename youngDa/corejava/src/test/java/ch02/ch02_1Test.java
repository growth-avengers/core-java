package ch02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ch02_1Test {

    @Test
    void cal() {
        String[] args = new String[2];
        args[0] = "8";
        args[1] = "2023";
        ch02_1.cal(args);
    }
}