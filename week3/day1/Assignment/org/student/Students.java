package week3.day1.Assignment.org.student;

public class Students {
	
	public void getStudentInfo(int id) {
		// TODO Auto-generated method stub
   System.out.println("student Id" +id);
	}
	
	public void getStudentInfo(int id, String name) {
		// TODO Auto-generated method stub
   System.out.println("student Id & Name" +id  +name);
	}
	
	public void getStudentInfo(String emailid, long phNo) {
		// TODO Auto-generated method stub
   System.out.println("student Email id & Phone Number" +emailid  +phNo);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Students Stu=new Students();
     Stu.getStudentInfo(101);
     Stu.getStudentInfo(101,"lavanya");
     Stu.getStudentInfo("lavanya@gmail.com", 9751502070L);
	}

}
