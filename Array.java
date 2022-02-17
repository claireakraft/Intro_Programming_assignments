import java.util.Arrays;
import java.util.Random;

public class Array {
	
	// private int[] b;
	
	// public Array(int[] x) {
		// b = x;
		
	//}
	
	//public Array(Array original) {
	//	b = original.b;
	//}
	
	public static void copyArray(int x[], int y[]) {
		int z = x.length;
		for (int i = 0; i < z; i++) {
            y[i] = x[i];
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int z = 10;
		int[] x = new int[z];
		int[] y = new int[z];
		
		Random r = new Random();
		for (int b = 0; b < 10; b++) {
			x[b] = r.nextInt(100);
		}
		
		copyArray(x,y);
		
	
		System.out.println(Arrays.toString(x));
		System.out.println(Arrays.toString(y));
		

	}

}
