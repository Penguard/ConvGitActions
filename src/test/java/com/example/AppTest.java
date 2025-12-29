package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void greet_withName() {
        assertEquals("Hello, Test!", App.greet("Test"));
    }

    @Test
    void greet_blank() {
        assertEquals("Hello, world!", App.greet("   "));
    }
}
