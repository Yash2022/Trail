/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ysach
 */
public class NewMainTest {
    
    public NewMainTest() {
    
    }
   @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception{
    }
    
    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }
    
    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception{
    }
    
    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception{
    }

    
     /* Test of main method, of class NewMain.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        NewMain.main(args);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of checkLength method, of class NewMain.
     */
    @Test
    public void testCheckLengthGood() {
        System.out.println("checkLengthGood");
        String pass = "Sheridan";
        boolean expResult = true;
        boolean result = NewMain.checkLength(pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
     public void testCheckLengthBad() {
        System.out.println("checkLengthBad");
        String pass = "Sheri";
        boolean expResult = false;
        boolean result = NewMain.checkLength(pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
      public void testCheckLengthBoundary() {
        System.out.println("checkLengthBoundary");
        String pass = "Sheridan";
        boolean expResult = true;
        boolean result = NewMain.checkLength(pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of checkUpper method, of class NewMain.
     */
    @Test
    public void testCheckUpperGood() {
        System.out.println("checkUpper Good");
        String pass = "Sheridan";
        boolean expResult = true;
        boolean result = NewMain.checkUpper(pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
     @Test
    public void testCheckUpperBad() {
        System.out.println("checkUpper Bad");
        String pass = "sheri";
        boolean expResult = false;
        boolean result = NewMain.checkUpper(pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
     @Test
    public void testCheckUpperBoundary() {
        System.out.println("checkUpper Boundary");
        String pass = "Sheridan";
        boolean expResult = true;
        boolean result = NewMain.checkUpper(pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of checkSpecial method, of class NewMain.
     */
    @Test
    public void testCheckSpecialGood() {
        System.out.println("checkSpecial");
        String pass = "Sherid@n";
        boolean expResult = true;
        boolean result = NewMain.checkSpecial(pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
       @Test
    public void testCheckSpecialBad() {
        System.out.println("checkSpecial");
        String pass = "Sheridan";
        boolean expResult = false;
        boolean result = NewMain.checkSpecial(pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
       @Test
    public void testCheckSpecialBopundary() {
        System.out.println("checkSpecial");
        String pass = "Sheri";
        boolean expResult = true;
        boolean result = NewMain.checkSpecial(pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}

