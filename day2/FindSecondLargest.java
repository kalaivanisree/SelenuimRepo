package week1.day2;

 import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		
		/*
		 Pseudo Code:
		 1) Arrange the array in ascending order
		 2) Pick the 2nd element from the last and print it
		 */
		
		int[] data = {3,2,11,4,6,7};
		int size=data.length;
		Arrays.sort(data);
		System.out.println("Arrays::"+Arrays.toString(data));
		int result=data[size-2];
		System.out.println("Second Largest"+result);
		
		
		

	}

}
