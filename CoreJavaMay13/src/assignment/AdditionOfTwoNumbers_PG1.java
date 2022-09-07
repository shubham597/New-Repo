package assignment;

public class AdditionOfTwoNumbers_PG1 {
	
	static int add(int a, int b) {
		System.out.println("First Number Is :"+a);
		System.out.println("Second Number Is :"+b);
		int res=a+b;
		System.out.println("Addition of Two Nmber is :"+res);
		return res;
	}

	public static void main(String[] args) {
		
		add(10, 20);

	}

}
