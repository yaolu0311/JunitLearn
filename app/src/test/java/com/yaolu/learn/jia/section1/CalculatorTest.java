package com.yaolu.learn.jia.section1;

import junit.framework.Assert;

import org.junit.Test;

/**
 * Created by Administrator on 2016/3/10.
 */
public class CalculatorTest {

    @Test
    public void testAdd(){
        Calculator calculator = new Calculator(10,10);
        Assert.assertEquals(20,calculator.add());
    }
    @Test
    public void testSub(){
        Calculator calculator = new Calculator(10,10);
        Assert.assertEquals(0,calculator.sub());
    }
    @Test
    public void testTimes() {
        Calculator calculator = new Calculator(100,10);
        Assert.assertEquals(1000,calculator.times());
    }

    @Test
    public void testDivide(){
        Calculator calculator = new Calculator(100,0);
        Assert.assertEquals(0,calculator.divide());
    }

}
