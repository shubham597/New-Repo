package assignment;

public class LeapYear_PG9 {
	
	static boolean leapYear(int year) {
		if (((year %4 ==0)&&(year % 100 !=0))||(year % 400==0)) {
			System.out.println("This is a leap year ="+year);
			return true;
		}else {
			System.out.println("Not a Leap Year");
			return false;
		}
		
	
	}
	
	public static void main(String[] args ) 
	{
		leapYear(1995);
		leapYear(2008);
		System.out.println(leapYear(2008));
	}

}
