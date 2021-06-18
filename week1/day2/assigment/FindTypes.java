package week1.day2.assigment;

public class FindTypes {

	public static void main(String[] args) {
		String test="$$ Welcome to india 2nd time $$";
		int letter=0,space=0,num=0,specialcharacter=0;
		char str[]=test.toCharArray();
		for(int i=0;i<=test.length()-1;i++)
		{
			if(Character.isLetter(str[i]))
					letter++;
			else if(Character.isSpaceChar(str[i]))
					space++;
			else if(Character.isDigit(str[i]))
					num++;
			else
					specialcharacter++;
			
		}
		System.out.println("The Number of Letter in a string is "+letter);
		System.out.println("The Number of Digit in a string is "+num);
		System.out.println("The Number of Space in a string is "+space);
		System.out.println("The Number of Specialcharacter in a string is "+specialcharacter);
	}

}
