package week3.day1.Assignment.org.student;

import week3.day1.Assignment.org.department.Department;

public class Student extends Department {
	
	public void studentName() {
		// TODO Auto-generated method stub
      System.out.println("Student Name : Lavanya");
	}
	public void studentDept() {
		// TODO Auto-generated method stub
      System.out.println("Student DeptName: CSE ");
	}
	public void studentId() {
		// TODO Auto-generated method stub
      System.out.println("Student ID: 103");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Student student=new Student();
      student.studentName();
      student.studentDept();
      student.studentId();
      student.deptName();
      student.collegeName();
      student.collegeCode();
      student.collegeRank();
	}

}
