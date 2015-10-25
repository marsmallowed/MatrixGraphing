package model;

public class Ellipse 
{
	private double x;
	private double y;
	private double vertical;
	private double horizontal;
	  
	public Ellipse(double x, double y, double vertical, double horizontal)
	{
		this.x = x;
	    this.y = y;
	    this.vertical = vertical;
	    this.horizontal = horizontal;
	}

	public double getX()
	{
		return x;
	}

	public double getY()
	{
		return y;
	}

	public double getVertical() 
	{
		return vertical;
	}

	public double getHorizontal() 
	{
		return horizontal;
	}

	public void setX(double x)
	{
		this.x = x;
	}

	public void setY(double y)
	{
		this.y = y;
	}

	public void setVertical(double vertical)
	{
		this.vertical = vertical;
	}

	public void setHorizontal(double horizontal)
	{
		this.horizontal = horizontal;
	}
	  
	public Ellipse translate(double addX, double addY)
	{
		 return new Ellipse(this.x + addX, this.y + addY, this.vertical, this.horizontal);
	}
	
	public Ellipse reflectX()
	{
		return new Ellipse(this.x, -this.y, this.vertical, this.horizontal);
	}
	
	public Ellipse reflectY()
	{
		return new Ellipse(-this.x, this.y, this.vertical, this.horizontal);
	}
	
	public Ellipse scale(double val)
	{
		return new Ellipse(this.x, this.y, this.vertical * val, this.horizontal * val);
	}
	
	public Line rotate(double angle)
	{
		 double angle1 = Math.toRadians(angle);
		 double cosine = Math.cos(angle1);
		 double sine = Math.sin(angle1);
		 //commented muna 
		// return new Line(this.x1 * cosine + this.y1 * sine, - this.x1 * sine + this.y1 * cosine, this.x2 * cosine + this.y2 * sine, - this.x2 * sine + this.y2 * cosine);
		 return null;
	}

}
