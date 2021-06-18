package week1.day2.assigment;

public class FindIntersection {

	public static void main(String[] args) {
		int arr1[]= {3,4,5,6,7};
		int arr2[]= {1,2,4,5,6,};
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
					System.out.println(arr1[i]);
			}
		}
		

	}

}
