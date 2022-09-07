package operators;

public class Relatiop {
	
	public static void main(String[] args) {
		// Variables Definition and Initialization
		int num1 = 15, num2 = 51;
		System.out.println("num1: " + num1 + "--->num2: " + num2);// 15 51
		// is equal to
		boolean res = (num1 == num2);
		System.out.println("num1 == num2 = " + res);// f
				//or
		System.out.println("num1 == num2 = " + (num1 == num2));//f
		// is not equal to
		System.out.println("num1 != num2 = " + (num1 != num2));// t
		// Greater than
		System.out.println("num1 >  num2 = " + (num1 > num2));// f
		// Less than
		System.out.println("num1 <  num2 = " + (num1 < num2));// t
		// Greater than or equal to
		System.out.println("num1 >= num2 = " + (num1 >= num2));//f
		// Less than or equal to
		System.out.println("num1 <= num2 = " + (num1 <= num2));//t
	}
}
//All relational operator will give you the result in form of true or false(boolean)

