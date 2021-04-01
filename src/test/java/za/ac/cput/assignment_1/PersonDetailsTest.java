package za.ac.cput.assignment_1;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;

/**
 *
 * @author Wilbur Smith 220003033
 */
public class PersonDetailsTest 
{//Start of class PersonDetailsTest
    
    //Atributes of the test class
    private PersonDetails person1;
    private PersonDetails person2;
    private PersonDetails person3;

    public PersonDetailsTest()
    {
        
    }
    
    //Creating objects before each test
    @BeforeEach
    public void setUp() 
    {
        person1 = new PersonDetails();
        person2 = new PersonDetails();
        person3 = person1;
    }
    
    //Testing if objects are equal to each other
    @Test
    public void testEquality()
    {
    assertEquals( person1, person3);
    }
    
    //Testing if object are identical to each other
    @Test
    public void testIdentity()
    {
        assertSame(person1, person3);
    }
    
    //Testing if the object are identical to each other, but failing the test
    @Test
    public void testIdentityFail()
    {
        assertSame(person1, person3);
        fail("Setting up this test to fail");
    }
    
    //Setting up a test to timout after a certain amount of time
    @Test
    @Timeout(value = 1, unit = TimeUnit.MILLISECONDS)
    public void testTimeout()
    {
        int sum = 1000000 + 1000000;
        assertEquals(sum,2000000);  
    }
    
    //Testing if object are identical to each other, but disabling the test
    @Test
    @Disabled
    public void testIdentityDisable()
    {
        assertSame(person1, person3);
    }
    
}//End of class PersonDetailsTest
