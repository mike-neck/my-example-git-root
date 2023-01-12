package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
class AppTest {

    @Test
    void test() {
        assertDoesNotThrow(() -> {
            Class.forName("com.example.App");
        });
    }
}
