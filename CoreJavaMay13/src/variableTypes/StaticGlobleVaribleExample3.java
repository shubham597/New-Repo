package variableTypes;

public class StaticGlobleVaribleExample3 {
	// static global variable
		static int age;
		static boolean res;
		static char grade;
		static float roi;

	public static void main(String[] args) {
		System.out.println("Program Starts");
		//we access to static global variable directly from here as main() is also static
		System.out.println("default value of int "+StaticGlobleVaribleExample3.age);
		System.out.println("default value of boolean "+StaticGlobleVaribleExample3.res);
		System.out.println("default value of char "+StaticGlobleVaribleExample3.grade);
		System.out.println("default value of float "+StaticGlobleVaribleExample3.roi);
		System.out.println("*********************************************************");
		StaticGlobleVaribleExample3.age =25;
		res =true;
		grade='A';
		roi =6.5f;
		
		
		System.out.println("updated value of int "+StaticGlobleVaribleExample3.age);
		System.out.println("updated value of boolean "+StaticGlobleVaribleExample3.res);
		System.out.println("updated value of char "+StaticGlobleVaribleExample3.grade);
		System.out.println("updated value of float "+StaticGlobleVaribleExample3.roi);
		System.out.println("Program Ends");

	}

}
