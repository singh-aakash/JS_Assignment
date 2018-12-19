package day3;

import static org.junit.Assert.*;

import org.junit.Test;

public class testcaseDate {

	Date date = new Date(12, 12, 2012); 
	@Test
	public void testShowDate() {
		assertEquals("12/12/2012", date.toString()); 
	}
	
	@Test
	public void testSmallerDate(){
		Date d = new Date(10,12,2012);
		boolean result = d.isSmaller(d);
		assertTrue(result);
	}
	
	@Test
	public void testDifferenceDate(){
		Date d = new Date(10,10,2012);
		int[] result = d.diff(d);
		int[] expected = {2,2,0};
		assertArrayEquals(expected, result);
		//assertTrue(result);
	}
}
