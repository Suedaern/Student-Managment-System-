package oop;

import java.util.ArrayList;
import java.util.List;

public class Students 
{
	private String name;
	private String number;
	private int year;
	ArrayList<Courses>courses= new ArrayList<Courses>();
	ArrayList<Students>studentList= new ArrayList<Students>();
	ArrayList<Grades>gradelist= new ArrayList<Grades>();
	private int id;
	private int numCourses1;
	
	public Students (String name,String number,int year)
	{
		this.name=name;
		this.number=number;
		this.year=year;
	}
	
    public String getName()
    {
        return name;
    }
   
    public String getNumber()
    {
        return number;
    }
    public int getYear()
    {
        return year;
    }
  
    public int getId()
    {
        return id;
    }
    public void setNumCourses1(int numCourses1)
    {
    	this.numCourses1=numCourses1;
    }
    public int getNumCourses1()
    {
    	return numCourses1;
    }
    
 
    public void showCourses() 
    {
    	for(int i=0;i<courses.size();i++)
		{
			 System.out.println("" + name + " " + courses.get(i).getName());
		}
    }
   
    
    public String toString()
    {
    	return getName() + " " + getNumber() + " " + getYear();
    }
    
}
