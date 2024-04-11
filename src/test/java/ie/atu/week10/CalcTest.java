package ie.atu.week10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcTest {
    Calc newCalc;

    @Test
    void testAdd()
    {
        newCalc = new Calc();
        assertEquals(10,newCalc.add(4,6));
    }
    @Test
    void testSubract()
    {
        newCalc = new Calc();
        assertEquals(2,newCalc.subtract(6,4));
    }
    @Test
    void testMultiply()
    {
        newCalc = new Calc();
        assertEquals(24,newCalc.multiply(4,6));
    }
    @Test
    void testDivide()
    {
        newCalc = new Calc();
        assertEquals(2,newCalc.divide(8,4));
    }
}
