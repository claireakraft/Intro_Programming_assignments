import java.util.Scanner;

public class ProgrammingAssignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Problem #1
		/*
		int a;
		int b;
		int c;
	

		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter first integer");
		a = scnr.nextInt();
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter second integer");
		b = scn.nextInt();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter third integer");
		c = sc.nextInt();
		scnr.close();
		scn.close();
		sc.close();
		
		
		if (a>b && a>c) {
			System.out.print(a);
		}
		else if (b>a && b>c) {
			System.out.print(b);
		}
		else if (c>b && c>a) {
			System.out.print(c);
		}
		*/
		// problem #2
		 int year;
		
		Scanner leap = new Scanner(System.in);
		System.out.println("Enter a year below:");
		year = leap.nextInt();
				leap.close();
		
		if (((year % 4 == 0) && (year % 100!= 0)) || (year % 400 == 0))
	         System.out.println(year + " is a leap year");
	      else
	         System.out.println(year + " is not a leap year");
		
		
	}

}
