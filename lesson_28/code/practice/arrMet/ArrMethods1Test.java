package practice.arrMet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrMethods1Test {

    ArrMethods1 arrMethods1;

    @BeforeEach
    void setUp() {
        arrMethods1=new ArrMethods1();
    }

    @Test
    void numOfPosit() {
        int []arr={-1,-2,0,-1,-9,-3};
        assertEquals(0,arrMethods1.numOfPosit(arr));
    }

    @Test
    void numOfNeg() {
        int []arr={-1000,-100,-10,1,2,0,-1,-9,0};
        assertEquals(5,arrMethods1.numOfNeg(arr));
    }

    @Test
    void numZero() {
        int []arr={1,2,-1,3,10000};
        assertEquals(0,arrMethods1.numZero(arr));
    }

    @Test
    void numOfEven() {
        int []arr={1,2,0,-1,-9,3,56,355,-16,8,4};
        assertEquals(6,arrMethods1.numOfEven(arr));
    }
}