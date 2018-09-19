package com.cg.capgemini.HelloWorld.HelloWorld;

import org.junit.Assert;
import org.junit.Test;


public class CalculatorTest {
    @Test
    public void testAdd(){
        Calculator calc=new Calculator();
        int res=calc.add(2,4);
        Assert.assertEquals(6,res);
    }
    @Test
    public void testSubtract(){
        Calculator calc=new Calculator();
        int res=calc.subtract(10,4);
        Assert.assertEquals(6, res);
    }
    @Test
    public void test_multiply(){
    	Calculator calc = new Calculator();
    	int res=calc.multiply(1, 4);
    	Assert.assertEquals(8, res);
    }
}