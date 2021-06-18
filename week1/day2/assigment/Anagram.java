package week1.day2.assigment;


import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
	    boolean status;
		String str1="stops";
		String str2="posts";
		char[] str3,str4;
		if(str1.length()!=str2.length())
		{
		status=false;
		}
		else
		{	  
	    	str3=str1.toCharArray();
			str4=str2.toCharArray();
		
		Arrays.sort(str3);
		Arrays.sort(str4);
		status=Arrays.equals(str4,str3);
		}
		if(!status)
		{
			System.out.println(str1+"and"+str2+" is not anagram");
		}
		else
		{
			System.out.println(str1+"and"+str2+" is anagram");
		}
		
		
	}

}
