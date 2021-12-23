package com.example.jse.mex.s04;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Exercise3Test {
    @Test
    void pyramidPlain() {
        int input = 3;
        String[] actual = Exercise3.pyramid(input);

        assertThat(actual.length).isEqualTo(input);
        for (int i = 0; i < input; i++) {
            assertThat(actual[i]).matches(String.format("x{%d}", i + 1));
        }
    }
}