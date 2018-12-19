package day3;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCasePerson {

	Person person1 = new Person("Ram", 5, 6, 1980);
	Person person2 = new Person("Shyam", 2, 3, 1987);
	
	@Test
	public void testShow1() {
		person1.toString();
		//assertEquals("Name: Ram, Date Of Birth: 5/6/1980", person1.toString());
	}
	@Test
	public void testShow2() {
		person2.toString();
		//assertEquals("Name: Shyam, Date Of Birth: 2/3/1987", person2.toString());
	}
	
	@Test
	public void testOlderOne() {
		
		//assertEquals("Name: Shyam, Date Of Birth: 2/3/1987", person1.olderOne(person2));
	}

}
