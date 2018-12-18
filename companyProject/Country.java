package companyProject;

public class Country {
	private String countryName;
	private int population;
	private double area;
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
	
}
