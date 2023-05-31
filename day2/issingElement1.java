package week1.day2;

import java.util.Arrays;


public abstract class issingElement1 {

	public static void main(String[] args) {
		
		
		
			
		 int[] a= {1,2,3,4,7,6,8,11,15};
		 
	        Arrays.sort(a);
	        
	        for(int i=0;i<a.length-1;i++)
	        {
	            if(a[i+1]-a[i]>1)
	            {
	                int temp=a[i+1]-a[i];
	                for(int j=1;j<temp;j++) 
	                {
	                 System.out.print(a[i]+j + " ");
	                }
	                temp=0;
	            }
	        }

	}

}
