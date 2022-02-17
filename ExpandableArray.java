import java.util.Arrays;

public class ExpandableArray {
	
	private int[] ar;
	private int length = 0;
	
	 public ExpandableArray() {
		 ar = new int[2];
	
	}
	 
	
	public void add(int toadd) {
		
		if (length == ar.length) {
			ar = Arrays.copyOf(ar, ar.length*2);
		
		}
		toadd = ar[length++];
		
	}
	 
	public int getsize() {
		return length;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExpandableArray e = new ExpandableArray();
		
		
		e.add(3);
		e.add(4);
		e.add(6);
		e.add(8);
		e.add(16);
		 
		System.out.print("Number of Additions: " + e.getsize());


	}

}
