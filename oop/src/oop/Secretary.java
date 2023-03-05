package oop;

import java.util.ArrayList;
import java.util.List;

public class Secretary extends Staff
{
	List<Lecturer>lecturerList= new ArrayList();
	
	public Secretary(String name,int id,String taskInformation,String workingHours)
	{
		super(name,id,taskInformation,workingHours);
	}
	
	public Courses appointLecturer(Courses course,Lecturer lecturer)
	{
		if(lecturer.getNumCourses()<lecturer.MAX_COURSES)
		{
			addCourse(lecturer,course);
		    course.setLecturer(lecturer);
		}
		
		else
		{
			System.out.println("This lecturer access to max course number");
		}
		return course;
		
	}
	
	public Courses changeLecturer(Courses course, Lecturer lecturer)
	{
		deleteCourses(course.getLecturer(),course);
		addCourse(lecturer,course);
		return course;
	}
	
	public void addCourse(Lecturer lecturer,Courses course)
	{
		if(lecturer.getNumCourses()<lecturer.MAX_COURSES)
		{
			if(lecturer.courses.contains(course))
			{
				System.out.println("This course has already been added");
			}
			else 
			{
				lecturer.courses.add(lecturer.getNumCourses(),(Courses)course);
				lecturer.setNumCourses(lecturer.getNumCourses()+1);
				course.setLecturer(lecturer);
			}
		}
		
		else if(lecturer.getNumCourses()==lecturer.MAX_COURSES)
		{
			System.out.println("This lecturer access to max course number");
		}
	}
	
	public void deleteCourses(Lecturer lecturer,Courses course)
	{
		if(lecturer.getNumCourses()>0)
		{
			lecturer.courses.remove((Courses)course);
			lecturer.setNumCourses(lecturer.getNumCourses()-1);
		}
	}
	
	public void addLecturer(Lecturer lecturer)
	{
		lecturerList.add(lecturer);
	}
	
	public void printLecturer()
	{
		System.out.println("LECTURER LIST :");
		for(int i =0;i<lecturerList.size();i++)
		{
			System.out.println(lecturerList.get(i) + " ");
		}
	}
	
	public void salary(float s)
	{
		System.out.printf("Secretary's salary: %f");
		
	}
	
	public void raisedSalary(float s,float raise)
	{
		float newSalary=s+(s*raise);
		System.out.printf("Secretary's new salary is: %f",newSalary);
	}
	
}
