/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.assignment_1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.junit.Rule;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.rules.Timeout;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;

/**
 *
 * @author Alizwa Solibanzi - 220001499
 */
public class MydetailsTest {
   
    public MydetailsTest() {
    }
    private Mydetails mydetails1;
    private Mydetails mydetails2;
    
  
  
   
    @BeforeEach
    public void setUp() {
         mydetails1 = new Mydetails();
          mydetails2= new Mydetails();
    }
    //////////////////////////////////////////////////////////////Equality and Identity tests
     @Test
     public void testEquality(){
     assertEquals( mydetails1.getStudNum(), mydetails1.getStudNum());
     }
   
      @Test
     public void testIdentity(){
         assertSame( mydetails1,mydetails1);
       
     }
     ////////////////////////////////////////////////FailTest
 @Test
     public void testIdentityfail(){
         assertSame( mydetails1.getName(),  mydetails1.getName());
           fail("This test is true but it will fail");
     }
      @Test
     public void testEqualityfail(){
     assertEquals( mydetails2, mydetails2);
     fail("This test is true but it will fails");
     }
 /////////////////////////////////////////////Timeouttest 

    /**
     *
     */
@Test
public void timeout(){
    assertTimeout(Duration.ofMillis(100),()->{
        Thread.sleep(100);
        System.out.print("This is  timeout test");
    });
   }
  
    
    ///////////////////////////////////Disabling test, This test will be ignored
    @Disabled("Disable this test")
    @Test
    public void testEquals(){
     assertEquals( mydetails1, mydetails1);
    }
}
        
