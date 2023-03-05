package oop;

import java.util.ArrayList;

public abstract class Courses 
{
	private String courseCode;
	private String name;
	private int credit;
	//private Areas location;
	private Lecturer lecturer;
	ArrayList<Courses>courseList=new ArrayList<Courses>();
	ArrayList<Students>students=new ArrayList<Students>();
	
		public Courses (String courseCode,String name,int credit)
		{
			super();
			this.courseCode=courseCode;
			this.name=name;
			this.credit=credit;
		}
		
		public void setCourseCode(String courseCode)
		{
			this.courseCode=courseCode;
		}
		public String getCourseCode()
		{
			return courseCode;
		}
		public void setName(String name)
		{
			this.name=name;
		}
		public String getName()
		{
			return name;
		}
		public void setCredit(int credit)
		{
			this.credit=credit;
		}
		public int getCredit()
		{
			return credit;
		}
		/*public void setLocation(Areas location)
		{
			this.location=location;
		}
		public Areas getLocation()
		{
			return location;
		}
		*/
		public ArrayList<Students> getStudents() {
			return students;
		}

		public void setStudents(ArrayList<Students> students) {
			this.students = students;
		}
		public void setLecturer(Lecturer lecturer)
		{
			this.lecturer=lecturer;
		}
		public Lecturer getLecturer()
		{
			return lecturer;
		}
		
		public abstract void addCourse(Courses course);

		public abstract void printCourse();
		
		public void printStudents() {
			System.out.println("Students taking the "+ name + " course:");
			 for(int i=0;i<students.size();i++)
			   {
				   System.out.println(students.get(i).getName());
			   }
		}
		
		
		public String toString()
		{
			return getCourseCode() + " " + getName() + " " + getCredit();
		}
}
