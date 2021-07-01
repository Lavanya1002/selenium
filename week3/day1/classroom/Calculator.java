package week3.day1.classroom;


public class Calculator {
	
	public  void add(int a, int b)
    {
  	  int c=a+b;
  	  System.out.println("Add the two values" + c);
    }

	public  void add(int a, int b,int c)
    {
  	  int d=a+b+c;
  	  System.out.println("Add the three values" + d);
    }
	
	public  void multiply(int a, int b)
    {
  	  int c=a*b;
  	  System.out.println("Multiply the two values" + c);
    }

	public  void multiply(int a, double b)
    {
  	  double c=a*b;
  	  System.out.println("Multiply the interger & double values" + c);
    }
	
	public  void subtract(int a, int b)
    {
  	  int c=a-b;
  	  System.out.println("Subtract the two integer values" + c);
    }
	
	public  void subtract(double a,double b)
    {
  	  double c=a-b;
  	  System.out.println("Subtract the two double values" + c);
    }
	
	public  void divide(int a,int b)
    {
  	  int c=a/b;
  	  System.out.println("divide the two integer values" + c);
    }
	public  void divide(double a,int b)
    {
  	  double c=a/b;
  	  System.out.println("divide the double & integer values" + c);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal=new Calculator();
		cal.add(2,3);
		cal.add(4,5,6);
		cal.multiply(2,9);
		cal.multiply(3,1.8);
		cal.subtract(10,5);
		cal.subtract(15.5,5.6);
		cal.divide(10.8,3);
		cal.divide(10,2);
      	}

}
