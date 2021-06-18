package week1.day2.assigment;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
	   String test="changeme";
	   char str[]=test.toCharArray();
	   for(int i=0;i<str.length;i=i+2)
	   {
	    str[i]=Character.toUpperCase(str[i]);
	   }
	   System.out.println(new String(str));
	}

}
