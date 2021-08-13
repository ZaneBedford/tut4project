package tut4;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalc {
	@Test
	public void Testadd() {
		assertEquals(Calc.add(2,1),3);
	}
}