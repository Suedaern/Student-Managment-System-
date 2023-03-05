package oop;

public class HeadOfDepartment extends Lecturer
{

    public HeadOfDepartment(int id,String name)
    {
        super(id,name);
    }
    
    public void GraduateCertificate(int aldığıders, double ortalama, Students student)
    {
	if(aldığıders==1)
	{
            if(student.getClass().getName()=="proje.MasterStudents"&&ortalama>=2.5) 
            {
		System.out.println("This student is entitled to receive a master's degree");
            }
            else if(student.getClass().getName()=="proje.MasterStudents"&&ortalama<2.5)
            {
                System.out.println("This student's grade point average is not enough to get a diploma");
            }
            else if(student.getClass().getName()=="proje.DoctoralStudents"&&ortalama>=3.0) 
            {
            	System.out.println("This student is entitled to receive a doctoral degree");
            }
            else if(student.getClass().getName()=="proje.DoctoralStudents"&&ortalama<3.0)
            {
            	System.out.println("This student's grade point average is not enough to get a diploma");
            }
            else if(student.getClass().getName()=="proje.UnderGraduateStudents"&&ortalama>=2.0) 
            {
            	System.out.println("This student is entitled to receive a bachelor's degree");
            }
            else if(student.getClass().getName()=="proje.UnderGraduateStudents"&&ortalama<2.0)
            {
		System.out.println("This student's grade point average is not enough to get a diploma");
            }
        }
        else 
            {
		System.out.println("The number of courses taken by this student is not enough to graduate.");
            }
    }
}