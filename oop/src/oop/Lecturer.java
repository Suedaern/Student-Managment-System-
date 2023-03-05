package oop;

import java.util.ArrayList;

public class Lecturer 
{
	private int id;
	private String name;
	ArrayList<Courses>courses=new ArrayList<Courses>();
	ArrayList<Lecturer>lecturerList=new ArrayList<Lecturer>();
	public static final int  MAX_COURSES=10;
	private int numCourses;
	
	public Lecturer(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	public int getId() 
    {
		return id;
    }

	public void setId(int id)
    {
		this.id = id;
    }

	public String getName() 
    {
		return name;
    }

	public void setName(String name)
    {
		this.name = name;
    }

	public ArrayList getCourses() 
    {
		return courses;	
	}	

	public void setCourses(ArrayList courses)
    {
		this.courses = courses;
    }
	
	public int getNumCourses()
    {
		return numCourses;
    }

	public void setNumCourses(int numCourses) 
    {
		this.numCourses = numCourses;
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
		return getId() + " " + getName();
	}
	
	
	
}



