package ac.za.cput;

import org.hamcrest.CoreMatchers;
import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.junit.matchers.JUnitMatchers.*;

import static junit.framework.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest {
private static Bird bird,bird2,bird3;
    @Test
    public void testEquality() {
        bird=new Bird("black","medium","parakeet",12);
        bird2=new Bird("black","medium","parakeet",12);
        bird3=new Bird("white","small","Bugie",2);
        //Equality test
        assertEquals(bird.toString(),bird2.toString());
    }
    //Object Identity
    @Test
    public void testObject(){
        bird=new Bird("black","medium","parakeet",12);
        bird2=new Bird("black","medium","parakeet",12);
        bird3=new Bird("white","small","Bugie",2);
        assertThat(bird.toString(),is(bird2.toString()));
    }
    //Failing
    @Test
    public void testFailing(){
        bird=new Bird("black","medium","parakeet",12);
        bird2=new Bird("black","medium","parakeet",12);
        bird3=new Bird("white","small","Bugie",2);
        assertThat(bird.toString(), is(bird3.toString()));
    }
    @Test(timeout=1000)
    public void timeoutTest(){
        //Timeout
        boolean i=true;
        while(i=true){
            System.out.println("Timeout after 1000ms");
        }
    }
    //Test disable
    @Ignore
    @Test(timeout=1000)
    public void disableTest(){
        //Timeout
        boolean i=true;
        while(i=true){
            System.out.println("Disabled");
        }
    }
    
}
