package variableTypes;

public class StaticGlobleVaribleExample4 {
	// static global variable
		static int age=25;
		static boolean res;
		static char grade='B';
		static float roi;

	public static void main(String[] args) {
		System.out.println("Program Starts");
		//we access to static global variable directly from here as main() is also static
		System.out.println("default value of int "+StaticGlobleVaribleExample4.age);
		System.out.println("default value of boolean "+StaticGlobleVaribleExample4.res);
		System.out.println("default value of char "+StaticGlobleVaribleExample4.grade);
		System.out.println("default value of float "+StaticGlobleVaribleExample4.roi);
		System.out.println("*********************************************************");
		age =35;
		res =true;
		grade='A';
		roi =6.5f;
		
		
		System.out.println("updated value of int "+StaticGlobleVaribleExample4.age);
		System.out.println("updated value of boolean "+StaticGlobleVaribleExample4.res);
		System.out.println("updated value of char "+StaticGlobleVaribleExample4.grade);
		System.out.println("updated value of float "+StaticGlobleVaribleExample4.roi);
		System.out.println("Program Ends");

	}

}
