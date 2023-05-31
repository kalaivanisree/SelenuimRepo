package week1.day2;

public class FindIntersection {

	public static void main(String[] args)
	{
		/*
		 * Pseudo Code
		
		 * a) Declare An array for {3,2,11,4,6,7};	 
		 * b) Declare another array for {1,2,8,4,9,7};
		 * c) Declare for loop iterator from 0 to array length
		 * d) Declare a nested for another array from 0 to array length
		 * e) Compare Both the arrays using a condition statement
		 
		 *  f) Print the first array (should match item in both arrays)
		 */
		int myArr1[] = {3,2,11,4,6,7};
		
	      int myArr2[] = {1,2,8,4,9,7};
	      
	      System.out.println("Intersection of the two arrays :");
	     
	      for(int i = 0; i<myArr1.length; i++ ) 
	      {
	         for(int j = 0; j<myArr2.length; j++) 
	         {
	            if(myArr1[i]==myArr2[j])
	            {
	               System.out.println(myArr2[j]);
	            }
	         }
	      }
	   }

	}


