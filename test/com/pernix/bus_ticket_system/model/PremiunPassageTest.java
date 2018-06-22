/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pernix.bus_ticket_system.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Adrián
 */
public class PremiunPassageTest {
    private PremiunPassage passage;
    
    public PremiunPassageTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        passage = new PremiunPassage();
    }
    
    @After
    public void tearDown() {
    }
    
        /**
     * Tests of the deposit method, of the class PremiunPassage 
     */
    
    @Test 
    public void testDepositValid1(){
        passage.deposit(1000f);
        float result = passage.getMoney();
        float expected = 1000f;
        assertEquals(expected, result, 0.0);
    }
    
    @Test
    public void testDepositInvalid1(){
        passage.deposit(-1000f);
        float result = passage.getMoney();
        float expected = 0f;
        assertEquals(expected, result, 0.0);
    }
    
     /**
     * Tests of the collect method, of the class PremiunPassage 
     */
    
    @Test
    public void testCollectValid1(){
        passage.deposit(1000f);
        passage.collect(500f);
        
        float result = passage.getMoney();
        float expected = 500f;
        assertEquals(expected, result, 0.0);
    }
    
    @Test
    public void testCollectInvalid1(){
        passage.collect(-1000f);
        float result = passage.getMoney();
        float expected = 0f;
        assertEquals(expected, result, 0.0);
    }
    
    @Test
    public void testCollectInvalid2(){
        passage.collect(1000f);
        float result = passage.getMoney();
        float expected = 0f;
        assertEquals(expected, result, 0.0);
    }
    
    @Test
    public void testCollectInvalid3(){
        passage.deposit(500f);
        passage.collect(1000f);
        float result = passage.getMoney();
        float expected = 500f;
        assertEquals(expected, result, 0.0);
    }
    
    /**
     * Test of accept method, of class PremiunPassage.
     */
    @Test
    public void testAccept() {
        
    }
    
}
