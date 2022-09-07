package assignment;

public class EvenOddNumber_PG6 {
	
	static void evenOdd(int num) {
		if(num%2==0) {
			System.out.println("Given Number Is Even :"+num);	 
		}else {
			System.out.println("Given Number Is Odd :"+num);
		}
	
	}

	public static void main(String[] args) {
		
		evenOdd(7);
	}

}
