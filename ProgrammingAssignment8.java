import java.util.*;
public class ProgrammingAssignment8 {
	
	public static int toInt(String s) {
	    return Integer.parseInt(s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// problem 1
		
		int day, month, year;
		int second, minute, hour;
		GregorianCalendar calendar = new GregorianCalendar();
	     
		day = calendar.get(Calendar.DAY_OF_MONTH);
		month = calendar.get(Calendar.MONTH);
		year = calendar.get(Calendar.YEAR);
	  
		second = calendar.get(Calendar.SECOND);
		minute = calendar.get(Calendar.MINUTE);
		hour = calendar.get(Calendar.HOUR);
	  
		System.out.println("Current date: " + (month + 1) + "/" + day + "/" + year);
		System.out.println("Current time: "+ hour + ":" + minute + ":" + second);
        
        
        // problem 2
        
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter string below");
		String x = scnr.next();
      	String y = scnr.next();
      	
      	int a = Integer.valueOf(x);
      	int b = Integer.valueOf(y);
      	System.out.println(a);
      	System.out.println(b);
      	scnr.close();
	}	

}
