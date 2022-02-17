import java.util.Scanner;

public class ProgrammingAssignment7 {
	// Problem 1
	/*
	  public static void majority(boolean x, boolean y, boolean z) {
		if (x = true) {
			System.out.println(y || z);
			}
		else {
			System.out.println(y && z);	
			}
	}
*/
	// Problem 2
	
	public static double fact(double x) 
	{
		double product = 1;
		for (int y = 1; y <= x; y++) {
			product = product * y;
			
		}
	return product;
	}
	
	public static void sinusoid(int x) {
		double product;
		double sum = 0;
		double factorial;
	 
		
		for (int y= 0; y < 30; y++) {
			product = (2*y + 1);
			factorial = fact(product);
			//System.out.println(factorial);
			sum = sum + ((Math.pow((-1),y)) * ((Math.pow(x, (2*y + 1)))/ factorial) );
		}
		System.out.println(sum);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*
	boolean x = 3>1;
	boolean y = 2>1;
	boolean z = 9>12;
	majority(x,y,z);  
		*/
	
    Scanner scnr = new Scanner(System.in);
    int x = scnr.nextInt();
    //int n = scnr.nextInt();
	sinusoid(x);
	scnr.close();
	
	}

}
