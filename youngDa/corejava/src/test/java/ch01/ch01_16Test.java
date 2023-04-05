package ch01;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;


class ch01_16Test {

    @Test
    void main() {
        String[] args = new String[3];
        args[0] = "1";
        args[1] = "2";
        args[2] = "3";

        ch01_16.main(args);
    }

    @Test
    void average() {
    }
}