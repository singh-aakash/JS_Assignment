package day3;

import static org.junit.Assert.*;

import org.junit.Test;
public class TestCaseTriangle {

	private Triangle rightAngleTriangle = new Triangle(5,4,3);
	private Triangle equilateralTriangle = new Triangle(4,4,4);
	private Triangle isoscelesTriangle = new Triangle(5,5,4);
	private Triangle scaleneTriangle = new Triangle(5,3,4);
	@Test
	public void rightAngleTriangleTest() {									
	
		assertEquals(true,rightAngleTriangle.isRightAngleTriangle());
	}

	@Test												
	public void equilateralTriangleTest() {
	
		assertEquals(true,equilateralTriangle.isEquilateralTriangle());
	}

	@Test
	public void isoscelesTriangleTest() {							
	
		assertEquals(true,isoscelesTriangle.isIsoscelesTriangle());
	}

	@Test										
	public void scaleneTriangleTest() {
	
		assertEquals(true,scaleneTriangle.isScaleneTriangle());
	}

	@Test															
	public void equilateralIsAScaleneTriangleTest() {
	
		assertEquals(false, equilateralTriangle.isScaleneTriangle());		
	}
	
	@Test															
	public void isoscelesIsAScaleneTriangleTest() {
	
		assertEquals(false, equilateralTriangle.isScaleneTriangle());		
	}
	
}