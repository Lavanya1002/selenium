package week1.day2.assigment;


public class CharOccurance {

	public static void main(String[] args) {
		String str1="welcome to chennai";
		char search='e';
		int count=0,length;	
		length=str1.length();
		for(int i=0;i<=length-1;i++)
		{
			if(str1.charAt(i)==search)
				count++;
		}
		System.out.println("the number of character "+search+" is occured"+count);
		}

}
