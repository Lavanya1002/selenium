package week3.day2.Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortingUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] input = {"HCL","Wipro","Aspire Systems","CTS"};
		int length=input.length;
		Set<String> sortArray= new TreeSet<String>();
		
		for(int i=0;i<length;i++)
		{
		sortArray.add(input[i]);
		}
		
		System.out.println("The sorted array"+ sortArray);
		
		List<String> reverseString=new ArrayList<String>(sortArray);
		Collections.reverse(reverseString);
		System.out.println("the reverse Array String is"+ reverseString);
	}

}
