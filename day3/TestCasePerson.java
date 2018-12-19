package day3;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCasePerson {

	Person person1 = new Person("Ram", 5, 6, 1980);
	Person person2 = new Person("Shyam", 2, 3, 1987);
	
	@Test
	public void testShow1() {
		
		assertEquals("Name: Ram, Days: 14 months: 6 years: 38", person1.toString());
	}
	@Test
	public void testShow2() {
		
		assertEquals("Name: Shyam, Days: 17 months: 9 years: 31", person2.toString());
	}
	
	@Test
	public void testOlderOne() {
		
		//assertEquals("Name: Shyam, Date Of Birth: 2/3/1987", person1.olderOne(person2));
	}

}
