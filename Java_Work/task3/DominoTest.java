package task3;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;

import org.junit.Test;



public class DominoTest 
{
	private final ByteArrayOutputStream printData = new ByteArrayOutputStream();
	
	
	@Test
	public void TestDominoHightrue()
	{
		Domino dominoobject = new Domino(5, 4);
		int expectedhigh = 6;
		int expectedlow = 0;
		
		assertTrue(dominoobject.getDominohigh() >= expectedlow &&  dominoobject.getDominohigh() <= expectedhigh);
	}
		
		
	@Test
	public void TestDominoHighfalse()
	{
		Domino dominoobject = new Domino(7, -4);
		int expectedhigh = 6;
		int expectedlow = 0;
		
		assertFalse(dominoobject.getDominohigh() >= expectedlow &&  dominoobject.getDominohigh() <= expectedhigh);
	
	}
	
	@Test
	public void TestDominolowtrue()
	{
		Domino dominoobject = new Domino(5, 4);
		int expectedhigh = 6;
		int expectedlow = 0;
		
		assertTrue(dominoobject.getDominolow() >= expectedlow &&  dominoobject.getDominolow() <= expectedhigh);
		
	}
	
	@Test
	public void TestDominolowfalse()
	{
		Domino dominoobject = new Domino(-5, -4);
		int expectedhigh = 6;
		int expectedlow = 0;
		
		assertFalse(dominoobject.getDominolow() >= expectedlow &&  dominoobject.getDominolow() <= expectedhigh);
		
	}


}