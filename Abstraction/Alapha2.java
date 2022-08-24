package Abstraction;

public class Alapha2 extends Alapha
{
	private int length;
	private int width;
	public Alapha2()
	{
		
	}
	public Alapha2(int length,int width)
	{
		this.length=length;
		this.width=width;
	}

	
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return length*width;
	}
	@Override
	public String toString() {
		return "Alapha2 [length=" + length + ", width=" + width + ", calculateArea()=" + calculateArea() + "]";
	}
	

}
