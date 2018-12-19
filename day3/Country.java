package day3;

public class Country {
	private String countryName;
	private int population;
	private double area;
	private int length;
	public Country(String countryName, int population, double area) {
		this.countryName = countryName;
		this.population = population;
		this.area = area;
	}
	public String getCountryName() {
		return countryName;
	}
	public int getPopulation() {
		return population;
	}
	public double getArea() {
		return area;
	}
	
	public static int highestPopulationfunction(Country[] country){
		
		int highestPopulation = country[0].getPopulation(); 
		
		for(int count=1;count<country.length;count++)
		{
				if(highestPopulation < country[count].getPopulation())
				{
					highestPopulation = country[count].getPopulation();
				}
		}

		return highestPopulation;
	}
	
	public static double biggestAreafunction(Country[] country){
		
		double biggestArea = country[0].getArea(); 
		
		for(int count=1;count<country.length;count++)
		{
				if(biggestArea < country[count].getArea())
				{
					biggestArea = country[count].getArea();
				}
		}
	
		return biggestArea;
	}
	
	public static double highestDensityfunction(Country[] country){
		
		double highestDensity = country[0].getPopulation()/country[0].getArea(); 
		
		for(int count=1;count<country.length;count++)
		{
				if( highestDensity < (country[count].getPopulation()/country[count].getArea()) )
				{
					highestDensity = (country[count].getPopulation()/country[count].getArea());
				}
		}
		return highestDensity;
	}
	}