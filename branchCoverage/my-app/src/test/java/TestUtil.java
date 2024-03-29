import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class TestUtil {
  Util c;

  @Before
  public void setUp() { c = new Util(); }

  @Test
  public void example() {
    assertFalse(c.compute(1)); 
    assertFalse(c.compute(1,2));
    assertFalse(c.compute(2,2,3));
    assertTrue(c.compute(2,2,2));
    try{
      c.compute(0,1,2);
    }
    catch(RuntimeException e){
      
    }
  }
}