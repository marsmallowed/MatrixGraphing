package model;

public class Polygon 
{
	private int nSides = 0 ;
	private double[] x;
	private double[] y;

	public Polygon(int nSides, double[] x, double[] y)
	{
		this.nSides = nSides;
		this.x = x;
		this.y = y;
	}

	public int getnSides() 
	{
		return nSides;
	}

	public double[] getX() 
	{
		return x;
	}

	public double[] getY() 
	{
		return y;
	}

	public void setnSides(int nSides)
	{
		this.nSides = nSides;
	}

	public void setX(double[] x)
	{
		this.x = x;
	}

	public void setY(double[] y) 
	{
		this.y = y;
	}
	
	public Polygon translate(double addX, double addY)
	{
		double[] x1 = new double[this.nSides];
		double[] y1 = new double[this.nSides];
		
		for(int i = 0; i < this.nSides; i++)
		{
			x1[i] = this.x[i] + addX;
			y1[i] = this.y[i] + addY;
		}
		return new Polygon(this.nSides, x1, y1);
	}
	
	public Polygon reflectX()
	{
		double[] x1 = new double[this.nSides];
		double[] y1 = new double[this.nSides];
		
		x1 = this.x;
		
		for(int i = 0; i < this.nSides; i++)
		{
			y1[i] = -this.y[i];
		}
		return new Polygon(this.nSides, x1, y1);
	}
	
	public Polygon reflectY()
	{
		double[] x1 = new double[this.nSides];
		double[] y1 = new double[this.nSides];
		
		y1 = this.y;
		
		for(int i = 0; i < this.nSides; i++)
		{
			x1[i] = -this.x[i];
		}
		return new Polygon(this.nSides, x1, y1);
	}
	
	public Polygon scale(double val)
	{
		double[] x1 = new double[this.nSides];
		double[] y1 = new double[this.nSides];
		
		for(int i = 0; i < this.nSides; i++)
		{
			x1[i] = val * this.x[i];
			y1[i] = val * this.y[i];
		}
		return new Polygon(this.nSides, x1, y1);
	}
	
	public Polygon rotate(double angle)
	{
		 double angle1 = Math.toRadians(angle);
		 double cosine = Math.cos(angle1);
		 double sine = Math.sin(angle1);
		 double[] x1 = new double[this.nSides];
		 double[] y1 = new double[this.nSides];
		 
		 for(int i = 0; i < this.nSides; i++)
		 {
			 x1[i] = this.x[i] * cosine + this.y[i] * sine;
			 y1[i] = - this.x[i] * sine + this.y[i] * cosine;
		 }
		    
		 return new Polygon(this.nSides, x1, y1);
	}
}
