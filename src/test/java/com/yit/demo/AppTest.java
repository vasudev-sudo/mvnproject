package com.yit.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     */
    @Test 
    public void testAdd(){
        App app=new App();
        int result =app.add(2,3);
        System.out.println("Running test : 2+3 ="+result);
        assertEquals(5,result);
    }
    }

