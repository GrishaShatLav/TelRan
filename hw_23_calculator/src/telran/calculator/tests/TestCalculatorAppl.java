package telran.calculator.tests;

import org.junit.jupiter.api.*;
import telran.calculator.controller.CalculatorAppl;
import static org.junit.jupiter.api.Assertions.*;

class TestCalculatorAppl {
    @Test
    void calcTestAND(){assertEquals(2, CalculatorAppl.calc(6,3,"AND"));}
    @Test
    void calcTestOR(){assertEquals(15, CalculatorAppl.calc(8,7,"OR"));}
    @Test
    void calcTestXOR(){assertEquals(6, CalculatorAppl.calc(5,3,"XOR"));}
    @Test
    void calcTestNOT(){assertEquals(-6, CalculatorAppl.calc(5,3,"NOT"));}
    @Test
    void calcTestSHIFT_LEFT(){assertEquals(80, CalculatorAppl.calc(5,4,"SHIFT_LEFT"));}
    @Test
    void calcTestSHIFT_RIGHT(){assertEquals(2, CalculatorAppl.calc(11,2,"SHIFT_RIGHT"));}
    @Test
    void calcTestUNSIGNED_SHIFT_RIGHT(){assertEquals(2, CalculatorAppl.calc(75,5,"UNSIGNED_SHIFT_RIGHT"));}



}