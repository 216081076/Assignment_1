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
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Disabled;


/**
 *
 * @author Kamaludien
 */
public class BankAccount {
    private BankAccount user1;
    private BankAccount user2;
    private BankAccount user3;
    
    public BankAccount() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        user1 = new BankAccount();
        user2 = new BankAccount();
        user3 = new BankAccount();
        
        user1 = user3;
        
    }
    
    @Test
    void testIdentity()
    {
        assertSame(user1, user3);
    }

    @Test
     void testEquality()
    {
        assertEquals(user1, user3);

    }

    @Disabled
    @Test
    void testEqualitys()
    {
        assertEquals(user1, user3);

    }

    @Test
    void testToBeFailed()
    {
        assertSame(user1, user2);
    }


    @Test
    @Timeout(20)
    void timeoutCheck()
    {
        for (int i =0 ; i<25 ; i++)
            System.out.println(i);
    }


    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
