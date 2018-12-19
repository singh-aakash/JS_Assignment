package day3;

public class Triangle 
{
	private float side1;
	private float side2;
	private float side3;
	
	public Triangle(float side1, float side2, float side3){
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	public boolean isEquilateralTriangle(){
		if(side1 == side2 && side2 == side3)
			return true;
		else
			return false;	
	}
	
	public boolean isScaleneTriangle(){
		if(side1 != side2 && side2 != side3 && side1 != side3)
			return true;
		else
			return false;
	}
	
	public boolean isIsoscelesTriangle()
	{
		if((side1 == side2 && side2 != side3) || (side2 == side3 && side2 != side1) || (side1 == side3 && side1 != side2))
			return true;
		else
			return false;
	}
	
	public boolean isRightAngleTriangle()
	{	
		if(side1> side2 && side1>side3)
			{
			if(side1*side1 == (side2*side2 +side3*side3))
				return true;
			else 
				return false;
			}
	
		else 
			if(side2>side1 && side2>side3)
			{
				if(side2*side2 == (side1*side1 +side3*side3))
				return true;
			else 
				return false;
			}
		
			else 
			if(side3>side1 && side3>side2)
		{
			if(side3*side3 == (side2*side2 +side1*side1))
			return true;
			else 
			return false;
		}
			
		else
			return false;
		
	}
}	