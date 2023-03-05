package oop;

public class GraduateCourses extends Courses
{ 
	public GraduateCourses(String courseCode,String name, int credit)
	{
		super(courseCode,name,credit);
	}
	
	
	public void addCourse(Courses course)
	{
		courseList.add(course);
	}
	
	public void printCourse()
	{
		System.out.println("Course List:");
		for(int i=0;i<courseList.size();i++)
		{
			System.out.println(courseList.get(i));
		}
	}
	
	
}
