package model;

public class Point
{
	private double x;
	private double y;
	
	public Point(double x, double y)
	{
		this.x = x;
		this.y = y;
	}

	public double getX()
	{
		return x;
	}
	
	public double getY() 
	{
		return y;
	}

	public void setX(double x)
	{
		this.x = x;
	}

	public void setY(double y)
	{
		this.y = y;
	}
	
	public Point translate(double addX, double addY)
	{
		return new Point(this.x + addX, this.y + addY);
	}
	
	public Point reflectX()
	{
		return new Point(this.x, -this.y);
	}
	
	public Point reflectY()
	{
		return new Point(-this.x, this.y);
	}
	
	public Point scale(double val)
	{
		return new Point(val * this.x, val * this.y);
	}
}
