import static org.junit.Assert.*;
import org.junit.*;
import java.util.Arrays;
import java.util.List;

class IsMoon implements StringChecker {
  public boolean checkString(String s) {
    return s.equalsIgnoreCase("moon");
  }
}

public class TestListExamples {
  @Test(timeout = 500)
  public void testMergeRightEnd() {
    List<String> left = Arrays.asList("a", "b", "c");
    List<String> right = Arrays.asList("a", "d");
    List<String> merged = ListExamples.merge(left, right);
    List<String> expected = Arrays.asList("a", "a", "b", "c", "d");
    assertEquals(expected, merged);
  }

  @Test
  public void testListExamplesFilter() {
    List<String> twoMoons = Arrays.asList("a", "b", "c", "moon", "moon");
    List<String> expected = Arrays.asList("moon", "moon");
    StringChecker sc = new IsMoon();
    List<String> filtered = ListExamples.filter(twoMoons,sc);
    assertEquals(expected, filtered);
  }
}
