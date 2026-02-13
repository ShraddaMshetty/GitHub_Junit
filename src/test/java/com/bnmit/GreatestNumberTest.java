package com.bnmit;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GreatestNumberTest {

    @Test
    void testNormalNumbers() {
        GreatestNumber gn = new GreatestNumber();
        assertEquals(25, gn.findGreatest(10, 25, 15));
    }

    @Test
    void testAllEqual() {
        GreatestNumber gn = new GreatestNumber();
        assertEquals(5, gn.findGreatest(5, 5, 5));
    }

    @Test
    void testNegativeNumbers() {
        GreatestNumber gn = new GreatestNumber();
        assertEquals(-1, gn.findGreatest(-5, -1, -10));
    }

    @Test
    void testTwoEqualGreatest() {
        GreatestNumber gn = new GreatestNumber();
        assertEquals(20, gn.findGreatest(20, 20, 10));
    }

    @Test
    void testMixedNumbers() {
        GreatestNumber gn = new GreatestNumber();
        assertEquals(30, gn.findGreatest(-10, 30, 5));
    }
}

