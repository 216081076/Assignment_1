/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.assignment_1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Sinethemba Sithela 219112940
 */
public class SmallAppTest {
    
    private String name1;
    private String name2;
    private String name3;
    
    
    public SmallAppTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
       name1 = new name();
       name2 = new name();
        name2 = name3;
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testIdentity(){
        assertSame(name1, name3);   
    }
    
    @Test 
    public void testEquality(){
        assertEquals(name1, name2);
    }
    
    @Test(timeout=2000) 
    public static void timeOutTest() throws Exception{
        Thread.sleep( 2000);
    }
    
    
    /**
     * Test of getName method, of class SmallApp.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        SmallApp instance = new SmallApp();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class SmallApp.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        SmallApp instance = new SmallApp();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSalary method, of class SmallApp.
     */
    @Test
    public void testGetSalary() {
        System.out.println("getSalary");
        SmallApp instance = new SmallApp();
        String expResult = "";
        String result = instance.getSalary();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSalary method, of class SmallApp.
     */
    @Test
    public void testSetSalary() {
        System.out.println("setSalary");
        String salary = "";
        SmallApp instance = new SmallApp();
        instance.setSalary(salary);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAge method, of class SmallApp.
     */
    @Test
    public void testGetAge() {
        System.out.println("getAge");
        SmallApp instance = new SmallApp();
        String expResult = "";
        String result = instance.getAge();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAge method, of class SmallApp.
     */
    @Test
    public void testSetAge() {
        System.out.println("setAge");
        String age = "";
        SmallApp instance = new SmallApp();
        instance.setAge(age);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class SmallApp.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        SmallApp instance = new SmallApp();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
