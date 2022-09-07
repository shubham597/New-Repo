package variableTypes;

public class StaticGlobleVaribleExample6 {
	//static globle varible
	static int num1,num2=22,res;

	public static void main(String[] args) {
		System.out.println("Program Starts");
		
		System.out.println("Number 1 is ="+num1);
		System.out.println("Number 2 is ="+num2);
		res=num1+num2;
		System.out.println("Result is ="+res);
		System.out.println("*********************");
		num1=75;
		System.out.println("Updated Number 1 is ="+num1);
		System.out.println("Number 2 is ="+num2);
		res=num1+num2;
		System.out.println("Result is ="+res);
		System.out.println("*********************");
		
		num1=85;
		num2=65;
		System.out.println("Updated Number 1 is ="+num1);
		System.out.println("Updated Number 2 is ="+num2);
		res=num1+num2;
		System.out.println("Result is ="+res);
		
		System.out.println("Program Ends");
		

	}

}
