package practice.arrMet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumPrimeTest {
    NumPrime numPrime;

    @BeforeEach
    void setUp() {
        numPrime=new NumPrime();
    }

    @Test
    void numPr() {
        int n= 6;
        assertEquals(false, numPrime.numPr(n));
    }
}