package week1.day2.assigment;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int i;
		int[] a={1,2,3,4,6,7,8};

		Arrays.sort(a);
        
		for(i=a[0];i<=a[a.length-1];i++)
		{
		  if(a[i-1]!=i)
		{
	     int misEle=i;		  
		System.out.println(misEle);
		break;		
		}
		}
		
	}

}
