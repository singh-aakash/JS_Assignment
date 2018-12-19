package day3;

import java.time.LocalDate;
import java.time.Period;

class Person
{ 
	private String name; // data member to store the name of a person.
	private Date dob; // data member to store the date of birth of a person.
	private int day;
	private int month;
	private int year;
	private LocalDate dateOfBirth;
	LocalDate today = LocalDate.of(2018, 12, 19);
	
	
	public Person(String name, int day, int month, int year) {//constructor to initialize Person objects
		//initialize the data members of the current Person object using the parameters. 
		this.name = name;
		this.day = day;
		this.month = month;
		this.year = year;
		this.dateOfBirth = LocalDate.of(year, month, day);
	}

	@Override
	public String toString() {
		
		Period period = Period.between( dateOfBirth, this.today);
		System.out.println("Name: " + name + ", Days: " + period.getDays()
				+ " months: " + period.getMonths() + " years: "+ period.getYears());
		return "Name: " + name + ", Days: " + period.getDays()
				+ " months: " + period.getMonths() + " years: "+ period.getYears();
	}

	public String olderOne(Person person2) //method to identify the older of the two persons.
	{
		//Older one of the invoking and given person object is identified and its details are 
		//displayed in the following format:
		//.... is older than .... by ... years, ... months and ... days.
		Object old;
		Object young;
		if(this.dateOfBirth.isBefore(person2.dateOfBirth))
		{
			old = this.dateOfBirth;
			young = this.dateOfBirth;
		}
		else
		{
			young = this.dateOfBirth;
			old = this.dateOfBirth;
		}
		
		return name;
	}
}