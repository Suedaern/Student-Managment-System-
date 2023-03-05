package oop;

public abstract class Areas
{
	private  int floor;
	private  int number;
	
	public Areas(int floor,int number)
	{
		super();
		this.floor=floor;
		this.number=number;
	}
	
	public void setFloor(int floor)
	{
		this.floor=floor;
	}
	public int getFloor()
	{
		return floor;
	}
	public void setNumber(int number)
	{
		this.number=number;
	}
	public int getNumber()
	{
		return number;
	}
}

