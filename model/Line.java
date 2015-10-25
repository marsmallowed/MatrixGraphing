package model;

public class Line 
{
	private double x1;
	private double y1;
	private double x2;
	private double y2;
	
	public Line (double x1, double y1, double x2, double y2)
	{
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		
	}

	public double getX1() 
	{
		return x1;
	}

	public double getY1()
	{
		return y1;
	}

	public double getX2() 
	{
		return x2;
	}

	public double getY2()
	{
		return y2;
	}

	public void setX1(double x1) 
	{
		this.x1 = x1;
	}

	public void setY1(double y1) 
	{
		this.y1 = y1;
	}

	public void setX2(double x2) 
	{
		this.x2 = x2;
	}

	public void setY2(double y2) 
	{
		this.y2 = y2;
	}
	
	public Line translate(double addX1, double addY1, double addX2, double addY2)
	{
		return new Line(this.x1 + addX1, this.y1 + addY1, this.x2 + addX2, this.y2 + addY2);
	}
	
	public Line reflectX()
	{
		return new Line(this.x1, -this.y1, this.x2, -this.y2);		
	}
	
	public Line reflectY()
	{
		return new Line(-this.x1, this.y1, -this.x2, this.y2);
	}
	
	public Line rotate(double angle)
	{
		 double angle1 = Math.toRadians(angle);
		 double cosine = Math.cos(angle1);
		 double sine = Math.sin(angle1);
		    
		 return new Line(this.x1 * cosine + this.y1 * sine, - this.x1 * sine + this.y1 * cosine, this.x2 * cosine + this.y2 * sine, - this.x2 * sine + this.y2 * cosine);
	}
	
	public Line scale(double val)
	{
		return new Line(val * this.x1, val * this.x2, val * this.y1, val * this.y2);
	}
}
