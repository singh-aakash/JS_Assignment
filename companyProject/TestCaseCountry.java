package companyProject;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCaseCountry {
	Country []country = new Country[5];
	public void setup(){
		country[0] = new Country("India", 4000000, 2000);
		country[1] = new Country("America", 100000, 3000);
		country[2] = new Country("China", 5000000, 6000);
		country[3] = new Country("South Africa", 220000, 4000);
		country[4] = new Country("Australia", 100000, 500);
	}
	@Test													//test to check country with highest population
	public void testHighestPopulation() 
	{
		int highestPopulation = country[0].getPopulation(); 
		
		for(int count=1;count<country.length;count++)
		{
				if(highestPopulation < country[count].getPopulation())
				{
					highestPopulation = country[count].getPopulation();
				}
		}
		assertEquals(5000000,highestPopulation);
	}
	@Test														// test to check country with biggest area
	public void testBiggestArea() 
	{
		double biggestArea = country[0].getArea(); 
		
		for(int count=1;count<country.length;count++)
		{
				if(biggestArea < country[count].getArea())
				{
					biggestArea = country[count].getArea();
				}
		}
		
		assertEquals(6000,biggestArea,0);
	}
	
	
	
	@Test																//test to check density which is POPULATION/AREA
	public void testHighestDensity() 			
	{
		double highestDensity = country[0].getPopulation()/country[0].getArea(); 
		
		for(int count=1;count<country.length;count++)
		{
				if( highestDensity < (country[count].getPopulation()/country[count].getArea()) )
				{
					highestDensity = (country[count].getPopulation()/country[count].getArea());
				}
		}
		
		assertEquals(2000,highestDensity,0);
	}

}

