package week1.day2;

public class Maths {
	
	public int add(int a,int b) {
		return a+b;}
	
	
public int sub(int a,int b) {
	return a-b;}

public int div(int a,int b) {
	return a/b;}



	public static void main(String[] args)
	{ 
		Maths Calculation=new Maths();
		
	
		System.out.println(Calculation.add(3,5));
		System.out.println(Calculation.sub(3,5));
		System.out.println(Calculation.div(3,5));
		
	
		
		
	}

}
