import java.util.Random;
import java.util.Scanner;

public class ProgrammingAssignment10a {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		// problem 1
		int x = 10;
		int num[] = new int[x];
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter 10 Integers below:");
		
		for (int i = 0; i < x; i++) {
			num[i] = scnr.nextInt();
			
			}
		double sum = 0;
		for (int y = 0; y <x; y++){
			sum = sum + num[y];
			
		}
		
		double avg = sum/x;
		for (int z = 0; z < x; z++) {
			if (num[z] > avg) {
				System.out.println(num[z]);
			}
			
			}
		
		scnr.close();
		
	
		

	}

}
