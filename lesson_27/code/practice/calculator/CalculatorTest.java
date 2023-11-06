package practice.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator=new Calculator();
    }

    @Test
    void add() {
        int a=1;
        int b=2;
        assertEquals(3,calculator.add(a,b));
    }

    @Test
    void sub() {
        int a=3;
        int b=4;
        assertEquals(-1,calculator.sub(a,b));
    }

    @Test
    void mult() {
        int a=5;
        int b=6;
        assertEquals(30,calculator.mult(a,b));
    }

    @Test
    void div() {
        int a=15;
        int b=5;
        assertEquals(3,calculator.div(a,b));
    }

    @Test
    void rest() {
        int a=10;
        int b=6;
        assertEquals(4,calculator.rest(a,b));
    }
}