package day3;

public class Date {
	private int day;
	private int month;
	private int year;
	public Date(int day, int month, int year) {//initialize d, m, y of the current object using the d, m, y parameters. 
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public String toString(){
		return String.format("%d/%d/%d", day, month, year);//return the value of a Date object as a String in d/m/y format.
	}
	public boolean isSmaller(Date d)// method to check whether a date is smaller than the other 
	{
		if(d.year <= this.year)
		{
			if(d.month <= this.month)
			{
				if(d.day <= this.day)
				{
					return true;
				}
				else
				{
					return false;
				}
			}
			else
			{
				return false;
			}
		}
		else
		return false;
		//If the value of invoking Date object is smaller than the given object, true is returned otherwise false is returned.
	}
	public int[] diff(Date d) //method to find out the difference of days, months and years in two dates.
	{
		//The difference of days, months and years in the invoking and parameter Date objects 
		//is obtained and returned in an int array. The first element of the array should represent
		//difference of days; second one, the difference of months and the third one, the difference of years.
		int days = this.day - d.day;
		int months = this.month - d.month;
		int years = this.year - d.year;
		int[] newDate = {days, months, years};
		return newDate;
	}

}
