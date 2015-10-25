package model;

public class Vector
{
	private double x;
	private double y;
	
	public Vector(double x, double y)
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
	
	public Vector translate(double addX, double addY)
	{
		return new Vector(this.x + addX, this.y + addY);
	}
	
	public Vector reflectX()
	{
		return new Vector(this.x, -this.y);
	}
	
	public Vector reflectY()
	{
		return new Vector(-this.x, this.y);
	}
	
	public Vector scale(double val)
	{
		return new Vector(val * this.x, val * this.y);
	}
	
	public Vector rotate(double angle)
	{
		 double angle1 = Math.toRadians(angle);
		 double cosine = Math.cos(angle1);
		 double sine = Math.sin(angle1);
		    
		 return new Vector(this.x * cosine + this.y * sine, - this.x * sine + this.y * cosine);
	}
}
