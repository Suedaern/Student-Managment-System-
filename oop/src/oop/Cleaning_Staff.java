package oop;

public class Cleaning_Staff  extends Staff
{
	public Cleaning_Staff(String name,int id,String taskInformation,String workingHours)
	{
		super(name,id,taskInformation,workingHours);
	}
	
	public void salary(float s)
	{
		System.out.printf("Personel's salary: %f",s);
		
	}
}
