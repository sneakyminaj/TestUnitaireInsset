/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testunitaireinsset.string;

import java.util.HashMap;
import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author talend
 */
public class StringUtilsTest {
    
    public StringUtilsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of isChaineValide method, of class StringUtils.
     */
    @Test
    public void testIsChaineValide() {
        String str = "test";
        StringUtils instance = new StringUtils();
        
        boolean result = instance.isChaineValide(str);
        
        Assert.assertTrue("OK", result);
    }

    /**
     * Test of inverse method, of class StringUtils.
     */
    @Test
    public void testInverse() {
        String str = "tset";
        StringUtils instance = new StringUtils();
        
        String result = instance.inverse(str);
        Assert.assertEquals("test", result);
    }

    /**
     * Test of isPalindrome method, of class StringUtils.
     */
    @Test
    public void testIsPalindrome() {
        String str = "azerreza";
        StringUtils instance = new StringUtils();
        
        boolean result = instance.isChaineValide(str);
        
        Assert.assertTrue("OK", result);
    }

    /**
     * Test of compterOccurences method, of class StringUtils.
     */
    //@Test
    public void testCompterOccurences() {
        String str = "test";
        
        Map<String, Integer> expResult = new HashMap<>();
        expResult.put("t", 2);
        expResult.put("e", 1);
        expResult.put("s", 1);
        
        StringUtils instance = new StringUtils();
        Map<String, Integer> map = instance.compterOccurences(str);
        
        Assert.assertEquals(expResult, map);
    }
    
}
