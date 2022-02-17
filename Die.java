import java.util.Random;

public class Die {
	private int roll; 
	
	public Die()
	{  Random Rand = new Random();
	this.roll = Rand.nextInt(6)+1;
	}
	
	
	public int get() {
		return roll;
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}

}
