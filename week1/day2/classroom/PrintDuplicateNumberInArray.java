package week1.day2.classroom;

public class PrintDuplicateNumberInArray {

	public static void main(String[] args) {
		int data[]={1,3,5,17,9,12,45,34,15,17,19,10};

		int count=data.length;

		for(int i=0;i<data.length-1;i++)
		{   
		    count=0;
		    for(int j=i+1;j<data.length-1;j++)
		    { 
		      if(data[i]==data[j])
		       count++;
		}
		if(count!=0)
		System.out.println(data[i]);
		}

	}

}
