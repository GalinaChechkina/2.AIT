package practice.arrTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrTest {

    Arr arr;

    @BeforeEach
    void setUp() {
        arr=new Arr();
    }

    @Test
    void averEven() {
        int[]array={1,10,7,11,-10,555};
        assertEquals(0,arr.averEven(array));
    }
    @Test
    void averEven1() {
        int[]array={1,11,7,11,-13,555};
        assertEquals(Math.PI,arr.averEven(array));
    }
}