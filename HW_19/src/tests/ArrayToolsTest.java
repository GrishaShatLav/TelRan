package tests;


import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Assertions;
import tools.ArrayTools;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


class ArrayToolsTest {
    Integer[] arrOrig;



    @BeforeEach
    void setUp(){
        arrOrig = new Integer[]{1,2,3,4,5,6,7,8,9,3};

    }



    @org.junit.jupiter.api.Test
    void oddEvenComparator() {
        Integer[] expected = {2,4,6,8,9,7,5,3,3,1};
        ArrayTools.printArray(arrOrig);
        ArrayTools.oddEvenComparator(arrOrig,(s1,s2)->s1-s2);
        ArrayTools.printArray(arrOrig);
        assertArrayEquals(expected,arrOrig);
    }
}