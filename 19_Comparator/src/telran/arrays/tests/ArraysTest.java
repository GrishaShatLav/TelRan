package telran.arrays.tests;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import telran.arrays.tools.ArrayTools;

import java.util.Arrays;

public class ArraysTest {
    Integer[] arrNum;
    String[] arrStr;


    @BeforeEach
    void setUp(){
        arrNum = new Integer[]{9,7,4,2,5,9,1,0};
        arrStr = new String[]{"One","Two","Three","Four","Five"};
    }

    @Test
    void testPrintArray(){
        System.out.println("Test PrintArray");
        System.out.println("++++++++++++++++++++++++++++++++++++");
        ArrayTools.printArray(arrNum);
        ArrayTools.printArray(arrStr);
    }

    @Test
    void testBubbleSortInteger() {
        System.out.println("Integer Bubblesort");
        ArrayTools.bubbleSort(arrNum);
        ArrayTools.printArray(arrNum);
    }

    @Test
    void testBubbleSortString() {
        System.out.println("String Bubblesort");
        ArrayTools.bubbleSort(arrStr);
        ArrayTools.printArray(arrStr);
    }
    @Test
    void testFindFirst(){
        System.out.println("Test Find FIrst");
        System.out.println("++++++++++++++++++++++++++++++++++++");
        Integer res = ArrayTools.findFirst(arrNum, n-> (int)n%2==0);
        System.out.println(res);
        String str = ArrayTools.findFirst(arrStr, s-> s.length() ==4);
        System.out.println(str);
    }

    @Test
    void testBubbleSortStringComparator(){
        System.out.println("Test BubbleSortString Comparator");
        ArrayTools.bubbleSort(arrStr,(s1,s2)->s1.length()-s2.length());
        ArrayTools.printArray((arrStr));
    }


}
