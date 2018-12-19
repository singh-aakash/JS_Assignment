package day3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCountry {
	Country []country = new Country[2];
	Country country1 = country[0];
	Country country2 = country[1];
	@Before
	public void setup(){

		country[0] = new Country("India", 14000000, 12000);
		country[1] = new Country("America", 100000, 13000);
	}
	@Test									
	public void testHighestPopulation() 
	{
		assertEquals(14000000, Country.highestPopulationfunction(country));
	}
	@Test										
	public void testBiggestArea() 
	{	
		assertEquals(13000,country1.biggestAreafunction(country),0.0);
	}
	
	@Test											
	public void testHighestDensity() 			
	{		
		assertEquals(1166.6666666666667,country1.highestDensityfunction(country),0.0);
	}

}
