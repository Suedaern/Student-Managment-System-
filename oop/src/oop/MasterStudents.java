package oop;

import java.util.ArrayList;

public class MasterStudents extends Students implements IGraduateStudents
{ 

	public MasterStudents(String name,String number,int year)
	{
		super(name,number,year);
	}
	
	
	public void showDegree()
	{
		System.out.println(getName() + " is a master student");
	}
	
	public int kalanDersSayısı()
	{
		if(courses.size()<7)
		{
			System.out.println(getName() + " needs to take " + (7-courses.size() + "courses to graduate"));
			return 0;
		}
		else
			return 1;
	}
	
	
}
