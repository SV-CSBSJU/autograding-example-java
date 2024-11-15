import junit.framework.TestCase;
import org.junit.Test;
import java.util.*;
import java.io.*;
public class TestHello extends TestCase{
  
  TestHello testLab = new TestHello();
  @Test
  public void testHello()throws FileNotFoundException{
    assertEquals("Checking testhello ", "Hello World!\n", TestHello.testHello(coin));
    
  } 
}
