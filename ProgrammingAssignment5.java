import java.util.Scanner;

public class ProgrammingAssignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// problem 1
		
		/*
		int sum1;
		int sum2;
		int sum3;
		int sum4;
		int sum5;
		
		for (int x1 = 1000; x1 <= 1994; x1+=5)
		{
			sum1 = x1 + 1;
			sum2 = x1 + 2;
			sum3 = x1 + 3;
			sum4 = x1 + 4;
			sum5 = x1 + 5;
		    System.out.println("" + " " + sum1 + " " + sum2 + " " + sum3 + " " + sum4 + " " + sum5);
		}
		System.out.println(" 1996 1997 1998 1999");
		*/
		
		// problem 2
		
		Scanner scnr = new Scanner(System.in);
		System.out.println ("Enter an integer below:");
		int a = scnr.nextInt();
		System.out.println ("Enter " +  a + " integers below:");
		
		
		double sum = 0;
		for (int x = 1; x <= a; x++)
		{
		double b = scnr.nextDouble();
		sum = sum +b;
		
		}
		double avg;
		avg = sum/a;
		System.out.println(avg);
		
		
		
	}
	

}
