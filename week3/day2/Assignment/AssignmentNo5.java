package week3.day2.Assignment;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class AssignmentNo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data= {1,3,8,3,11,5,6,4,7,6,7};
           
	       
	       Set<Integer> charSet=new LinkedHashSet<Integer>();
	       Set<Integer> dupCharSet=new LinkedHashSet<Integer>();
	       for(int i=0;i< data.length;i++)
	       {
	    	   charSet.add(data[i]);    
	    	   for(int j=i+1;j<data.length;j++)
	    	   {
	    		   if(data[i]==data[j])
	    		   {
	    			   dupCharSet.add(data[i]);
	    		   }
	    	   }
	    	   
	       }
	    
	       System.out.println("the Duplicate character are"+dupCharSet);
	}

}
