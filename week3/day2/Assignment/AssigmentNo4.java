package week3.day2.Assignment;

public class AssigmentNo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {4,0,3,0,1,5,2,0};
		int temp;
		
		for(int i=0;i<num.length;i++)
		{
			for(int j=i+1;j<num.length;j++)
			if(num[i]==0)
			{
				temp=num[j];
				num[j]=num[i];
				num[i]=temp;
				
			}
		}
		for(int i=0;i<num.length;i++)
		{
			System.out.println(num[i]);
		}
	}
}
		