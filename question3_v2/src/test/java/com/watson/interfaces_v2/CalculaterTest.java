package com.watson.interfaces_v2;

import junit.framework.TestCase;

public class CalculaterTest extends TestCase {

    Calculater calcObj = new CalculaterImplement();
    public void testAddition() throws Exception {
        float result = calcObj.add(27, 93);
        assertEquals(result,120.0f);
    }

    public void testSubtraction() throws Exception {
        float result = calcObj.subtract(93, 27);
        assertEquals(result,66.0f);
    }

    public void testMultiplication() throws Exception {
        float result = calcObj.multiply(27, 93);
        assertEquals(result,2511.0f);
    }


    public void testDivision() throws Exception {
        float result = calcObj.divide(4, 2);
        assertEquals(result,2.0f);
    }

}