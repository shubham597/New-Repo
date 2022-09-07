package variableTypes;

public class StaticGlobleVaribleExample2 {
	// static global variable
		static int age;
		static boolean res;
		static char grade;
		static float roi;

	public static void main(String[] args) {
		System.out.println("Program Starts");
		//we access to static global variable directly from here as main() is also static
		System.out.println("default value of int "+age);
		System.out.println("default value of boolean "+res);
		System.out.println("default value of char "+grade);
		System.out.println("default value of float "+roi);
		System.out.println("*********************************************************");
		age =25;
		res =true;
		grade='A';
		roi =6.5f;
		
		
		System.out.println("updated value of int "+age);
		System.out.println("updated value of boolean "+res);
		System.out.println("updated value of char "+grade);
		System.out.println("updated value of float "+roi);
		
		
		
		System.out.println("Program Ends");

	}

}
