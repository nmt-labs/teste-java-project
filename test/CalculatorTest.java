import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

  Calculator calc = new Calculator();

  @Test
  public void testTimes() {
    assertEquals(9, calc.times(3, 3));
  }

  @Test
  public void testSum() {
    assertEquals(6, calc.sum(3, 3));
  }
}
