package week1.day2.classroom;

import java.util.Arrays;

public class FindSecondLargestNumberInArray {

	public static void main(String[] args) {
		int data[]= {3,56,8,12,70};
		Arrays.sort(data);
		System.out.println(data[data.length-2]);

	}

}
