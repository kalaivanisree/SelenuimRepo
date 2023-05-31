package week1.day2;

import java.util.Arrays;

public class MissingElements2 {

	public static void main(String[] args) {
		

		int[] numbers = { 11, 6, 4, 5, 7, 1 };
		Arrays.sort(numbers);
		int Index = 0;
		for (int i = 0; i < numbers[numbers.length - 1]; i++) {
		    if (i == numbers[Index]) {
		        Index++;
		    }
		    else {
		        System.out.println(i);
		    }
		}
	}

}
