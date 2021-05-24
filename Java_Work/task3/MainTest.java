package task3;

import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;
import junit.framework.Assert;



public class MainTest {
	
	private final ByteArrayOutputStream printData = new ByteArrayOutputStream();

	
	
	
	@Test
	public void TestTotalDominos()
	{
		Main mainobject = new Main();
		int expectedResult = 28;
		assertEquals(expectedResult, mainobject.getTotalDominos());
	}
	
	
	@Test
	public void testplaced() {
        System.setOut(new PrintStream(printData));
        Main main = new Main();
        Domino d = new Domino(0, 0);
        d.placed = true;
        String expectedString = "That domino has already been placed :";
        main.placed(d);
        System.out.println(printData.toString());
        assertTrue(printData.toString().contains(expectedString));
    }
	
	
}
