package week1.day2.classroom;

public class Calculator {
	
	public int getAdd(int a,int b) {
		int sum=a+b;
		return sum;

	}
	
	public double getSub(double a,double b) {
		double dif=a-b;
		return dif;
	}
	
	public double getMul(double a,double b) {
		double multi=a*b;
		return multi;
	}
     public int getDiv(int a,int b) {
		int divide=a/b;
		return divide;
	}
	public static void main(String[] args) {
		Calculator cal=new Calculator();
		int add=cal.getAdd(20,40);
		System.out.println(add);
		double sub=cal.getSub(20.3,40.6);
		System.out.println(sub);
		double mul=cal.getMul(20.8,40.6);
		System.out.println(mul);
		int div=cal.getDiv(80,40);
		System.out.println(div);

	}

}
