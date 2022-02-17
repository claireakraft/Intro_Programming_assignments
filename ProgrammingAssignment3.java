
public class ProgrammingAssignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// problem 1
		
		int a = 1+2+3+4+5+6+7+8+9+10;
		double b = a/10.0;
		
		System.out.println("1 through 10 added together is " + a + ".");
		System.out.println("The average if the numbers 1 through 10 is " + b + ".");
		System.out.println(" ");
		
		// problem 2
		
		System.out.println("The truth table below is the table for !(p||q).");
		System.out.println("p      q      output");
		System.out.println("false  false  " + !(false || false));
		System.out.println("false  true   " + !(false || true));
		System.out.println("true   false  " + !(true || false));
		System.out.println("true   true   " + !(true || true));
		
		char[] emotion = {'h','a','p','p','y'};
		System.out.println(emotion[4]);
	}

}
