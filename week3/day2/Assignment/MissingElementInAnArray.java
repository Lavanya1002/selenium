package week3.day2.Assignment;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr = {1,2,3,4,7,6,8};
		Arrays.sort(arr);
		for(int i=arr[0];i<arr.length;i++)
		{
			if(arr[i-1]!=i)
			{
				System.out.println("The missing Element in Array" + i);
				break;
			}
		}
	}

}
