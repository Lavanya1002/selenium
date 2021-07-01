package week3.day2.Assignment;


import java.util.LinkedHashSet;
import java.util.Set;



public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String str="PayPal India";
       char[] str1=str.toCharArray();
       Set<Character> charSet=new LinkedHashSet<Character>();
       Set<Character> dupCharSet=new LinkedHashSet<Character>();
       for(int i=0;i< str1.length;i++)
       {
    	   charSet.add(str1[i]);    
    	   for(int j=i+1;j<str1.length;j++)
    	   {
    		   if(str1[i]==str1[j])
    		   {
    			   dupCharSet.add(str1[i]);
    		   }
    	   }
    	   
       }
       System.out.println(charSet);
       System.out.println(dupCharSet);
       String pattern="\\W";
      
       if(!charSet.equals(pattern))
       {
    	 System.out.println("After Removing the Duplicates"+ charSet); 
       }
	

}
}
