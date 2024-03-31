import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class TestCompute {
  Compute c;

  @Test
  public void example() {
    MessageQueue mq = mock(MessageQueue.class);
    c = new Compute(mq);
    assertTrue(true);
    assertEquals(-1,c.countNumberOfOccurrences(""));
  }
  @Test
  public void example2(){
    MessageQueue mq = mock(MessageQueue.class);
    when(mq.size()).thenReturn(1);
    c = new Compute(mq);
    assertEquals(0, c.countNumberOfOccurrences("TESTERE"));
  }
  @Test
  public void example3(){
    MessageQueue mq = mock(MessageQueue.class);
    when(mq.size()).thenReturn(4);
    when(mq.contains("TESTERE")).thenReturn(true);
    when(mq.getAt(0)).thenReturn("TESTERE");
    when(mq.getAt(1)).thenReturn("EN");
    when(mq.getAt(2)).thenReturn("SEVMEDIGIM");
    when(mq.getAt(3)).thenReturn("FILMDIR");
    c = new Compute(mq);
    assertEquals(1, c.countNumberOfOccurrences("TESTERE"));
  }
}