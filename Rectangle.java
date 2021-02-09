package com.shape;

public class Rectangle implements Polygon{
	float length;
	float breadth;
	
	public Rectangle(float length, float breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	public void calcArea() 
	{
		float area=length*breadth;
		System.out.println("Area of rectangle ="+area);
	}

	public void calcPeri() 
	{
		float peri=2*(length+breadth);
		System.out.println("Perimeter of rectangle ="+peri);
	}

	@Override
	public void peri() 
	{
		
		
	}

}


