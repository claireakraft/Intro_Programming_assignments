

public class TwoDie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Die d1 = new Die();
		Die d2 = new Die();
		int x = d1.get();
		int y = d2.get();
		if (x > y) {
			System.out.println("d1"); 
		}
		if (y > x) {
			System.out.println("d2"); 
		}

	}

}
