package week1.day2.classroom;

public class ArmStrong {

	public static void main(String[] args) {
		int input= 153,rem,calc=0;
		int original = input;
		while(input>0)
		{
		     rem =input%10;
		     calc+=rem*rem*rem;
		     input= input/10;
		}
		if(calc==original)
		{
		System.out.println(original+" is a Armstrong");
		}
		else
		{
			System.out.println(original+" is not a Armstrong");
		}
	}

}
