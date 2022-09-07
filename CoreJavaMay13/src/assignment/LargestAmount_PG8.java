package assignment;

public class LargestAmount_PG8 {
	
	static void largeAmount(int a,int b,int c) {
		if (a>b && a>c) 
		{
			System.out.println("a is largest number");
		}
		else if (b>a && b>c) 
		{
			System.out.println("b is largest number");
		}
		else if (c>a && c>b) 
		{
			System.out.println("b is largest number");
		}
	}

	public static void main(String[] args) {
		System.out.println("Prgoram Starts");
		largeAmount(10,25,11);
		largeAmount(101,25,11);
		largeAmount(10,25,112);
		largeAmount(1000,25,11);
		System.out.println("Prgoram Ends");
	}

}
