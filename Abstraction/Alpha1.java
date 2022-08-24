package Abstraction;

public  class Alpha1 extends Alapha
{
	private int radius;
	public Alpha1()
	{
		
	}
	public Alpha1(int radius)
	{
		this.radius=radius;
	}
	
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	@Override
	public double calculateArea() {
		return 3.14*radius*radius;
		// TODO Auto-generated method stub
		
	}
	@Override
	public String toString() {
		return "Alpha1 [radius=" + radius + ", calculateArea()=" + calculateArea() + "]";
	}
	
	
	

}
