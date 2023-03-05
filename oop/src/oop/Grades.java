package oop;

public class Grades 
{
	private int midterm;
	private int final_exam;
	private int credit;
	
	public Grades(int midterm,int final_exam,int credit)
	{
		this.midterm=midterm;
		this.final_exam=final_exam;
		this.credit=credit;
	}
	
	public void setMidterm(int midterm)
	{
		this.midterm=midterm;
	}
	public int getMidterm()
	{
		return midterm;
	}
	public void setFinal_exam(int final_exam)
	{
		this.final_exam=final_exam;
	}
	public int getFinal_exam()
	{
		return final_exam;
	}
	public void setCredite(int credit)
	{
		this.credit=credit;
	}
	public double getCredit()
	{
		return credit;
	}
	
	
	
}

