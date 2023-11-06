package practice.arrMet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrMethodsTest {
    ArrMethods arrMethods;

    @BeforeEach
    void setUp() {
        arrMethods= new ArrMethods();
    }

    @Test
    void sumElements() {
        int[] arr={1,2,0,-1,-100};
        assertEquals(-98,arrMethods.sumElements(arr));
    }

    @Test
    void searchElement() {
        int[] arr={1,0,110,-265,56};
        int n=-100;
        assertEquals(1.11,arrMethods.searchElement(arr,n));
    }
}