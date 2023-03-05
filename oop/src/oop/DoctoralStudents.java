package oop;

import java.util.ArrayList;

public class DoctoralStudents extends Students implements IGraduateStudents
{

	public DoctoralStudents(String name,String number,int year)
	{
		super(name,number,year);
	}
	

	public void showDegree()
	{
		System.out.println(getName() + " is a doctoral student");
	}
	
	
	
	public int  kalanDersSayısı()
	{
		if(courses.size()<8)
	    {
		   System.out.println(getName() + " needs to take " + (8-courses.size()) + "courses to take");
		   return 0;}
		else
			return 1;
	}
	
	
}
