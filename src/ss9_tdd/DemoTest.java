package ss9_tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DemoTest {

    @Test
    void sum() {
        assertEquals(-2147483649l, Demo.sum(-2147483640, -9));
    }
}