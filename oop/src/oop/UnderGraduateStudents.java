package oop;



public class UnderGraduateStudents extends Students 
{
	
	public UnderGraduateStudents(String name,String number,int year)
	{
		super(name,number,year);
		//TODO Auto-generated method stub  
	}
	
	public void kalanDersSayısı()
	{
		if(courses.size()<40)
		{
			System.out.println(getName() + " needs to take " + (40-courses.size() + "courses to graduate"));
		}
		else
		{
			System.out.println(getName() + " took enough courses to graduate");
		}
	}
	
	
	
	   
}
