/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.assignment_1;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Lindiwe Thokozile Somana
 * @student number 218076509
 */
public class EventsTest {
    
    private Events event1, event2, event3;
    
    public EventsTest() {
    }
    
   
    
    @BeforeEach
    public void setUp() {
        event1 = new Events();
        event2 = new Events();
        event1 = event3;
    }
    
    
     @Test
    public void testIdentity(){
        assertSame(event1, event3);   
    }
    
    @Test 
    public void testEquality(){
        assertEquals(event1, event3);
    }

    
    @Test
    public void testIdentityFail()
    {
        assertSame(event1, event3);
    }
    
    
    @Test
    @Disabled
    public void testIdentityDisable()
    {
        assertSame(event1, event3);
    }
    
}
