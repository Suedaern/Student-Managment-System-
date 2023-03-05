package oop;

import java.util.ArrayList;

public class Mentor extends Lecturer 
{
	static ArrayList<Grades>gradelist= new ArrayList<Grades>();
	ArrayList<Students>studentList= new ArrayList<Students>();
	
	public Mentor(int id,String name)
	{
		super(id,name);
	}
	
	

	public Courses appointStudent(Courses course,MasterStudents student)
	{
		addCourse(student,course);
		return course;
	}
	
	public void addCourse(Students student,Courses course)
	{
		
		try
		{
			if(student.getClass().getName().equals("MasterStudents"))
			{
				if(student.courses.contains(course))
					System.out.println("This course has already been added!");
				else 
				{
					student.courses.add((GraduateCourses)course);
					student.setNumCourses1(student.getNumCourses1()+1);
					course.students.add((MasterStudents)student);
				}
				
			}
			else if(student.getClass().getName().equals("DoctoralStudents"))
			{
				if(student.courses.contains(course))
					System.out.println("This course has already been added!");
				else
				{
					student.courses.add((GraduateCourses)course);
					student.setNumCourses1(student.getNumCourses1()+1);
					course.students.add((DoctoralStudents)student);
				}
				
			}
			else if(student.getClass().getName().equals("UnderGraduateStudents"))
			{
				if(student.courses.contains(course))
					System.out.println("This course has already been added!");
				else
				{
					student.courses.add((UnderGraduateCourses)course);
					student.setNumCourses1(student.getNumCourses1()+1);
					course.students.add((UnderGraduateStudents)student);
				}
				
			}
		}
		
		catch(java.lang.ClassCastException e)
		{
			System.out.println("for"+ student.getName() + course.getName() + " is invalid course!!");
		}
			
	}
	
	
	public void addStudent(Students student)
	{
		studentList.add(student);
	}
	
	public void addGrade(Students student,int vize,int finalexam,Courses course)
	{
		if(student.courses.contains(course))
		{
			Grades grade = new Grades(vize,finalexam,course.getCredit());
			gradelist.add(grade);
			student.gradelist.add((Grades)grade);
		}
		else 
		{
			System.out.println("This student is not taking this course!");
		}
	}
	
	public static double GPA(Students student)
	{
		double topcredit=0;
		double toplam=0;
		double toplamgrade=0;
		
		if(student.courses.size()>student.gradelist.size())
		{
			System.out.println("The grade of the course taken by this student has not been entered.");
		}
		else if(student.courses.size()==student.gradelist.size())
		{
			for(int i=0; i<gradelist.size();i++)
			{
				double average;
				average=(student.gradelist.get(i).getMidterm()*0.6)+(student.gradelist.get(i).getFinal_exam()*0.4);
				double letterGrade=0;
				
				if(average>=90)
					letterGrade=4.0;
				else if(average>=80)
					letterGrade=3.5;
				else if(average>=70)
					letterGrade=3.0;
				else if(average>=60)
					letterGrade=2.5;
				else if(average>=53)
					letterGrade=2.0;
				else if(average>=48)
					letterGrade=1.5;
				else if(average>=40)
					letterGrade=1.0;
				else if(average>=30)
					letterGrade=0.5;
				else
					letterGrade=0.0;
				topcredit=topcredit+gradelist.get(i).getCredit();
				toplam=letterGrade*gradelist.get(i).getCredit();
				toplamgrade=toplamgrade+toplam;
			}
		}
		double sonuc;
		sonuc=toplamgrade/topcredit;
		return sonuc;
	}


   public void printStudent()
   {
	   System.out.println("STUDENT LIST:");
	   for(int i=0;i<studentList.size();i++)
	   {
		   System.out.println(studentList.get(i));
	   }
   }	
}
