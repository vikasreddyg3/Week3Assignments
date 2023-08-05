package org.studentweek3day1assignment;

import org.departementweek3day1assignment.Departement;

public class Student extends Departement
{
	public void studentName(String sName)
	{
		System.out.println("Student Name :"+sName);
	}
	public void studentDept(String dept)
	{
		System.out.println("Student Dept :"+dept);
	}
	public void studentId(int sId)
	{
		System.out.println("Student id :"+sId);
	}
	
	public void getStudentInfo(int id)
	{
		System.out.println("Student id :"+id);
	}
	
	public void getStudentInfo(int id,String name)
	{
		System.out.println("Student id :"+id+" Student Name :"+name);
	}
	public void getStudentInfo(String email,String name)
	{
		System.out.println("Student id :"+email+" Student Name :"+name);
	}
	
	

	public static void main(String[] args) {
		
		Student obj=new Student();
		obj.collegeName("Sathyabama university");
		obj.collegeCode(3405);
		obj.collegeRank(34);
		obj.deptName("cse");
		obj.studentName("vikas");
		obj.studentDept("cse");
		obj.studentId(123);
		
	}
}
