// Single Inheritance Program 2
// Shape --> Circle

import java.lang.*;

class Shape //Parent class
{
	protected double x;
	
	public Shape()  //without parameterized constructor 
	{
		System.out.println("E-Shape");
	}
	public Shape(double x) //parameterized constructor 
	{
		System.out.println("P-Shape");
		this.x = x;
	}
	public void setX(double x)
	{
		this.x = x;
	}
	public double getX()
	{
		return x;
	}
	public double getArea()
	{
		return 0;
	}
}

class Circle extends Shape  //Child class
{
	public Circle()
	{
		System.out.println("E-Circle");
	}
	public Circle(double x)
	{
		super(x); //calling the parent const
		System.out.println("P-Circle");
	}
	public double getArea() //method overriding
	{
		return 3.1416 * x * x;
	}
	
}

public class ShapeAll //main class
{
  public static void main(String[] args)
  {
    Circle c2 = new Circle();
    System.out.println("c2 x:"+c2.getX());
    System.out.println("c2 area:"+c2.getArea());
  }
}
