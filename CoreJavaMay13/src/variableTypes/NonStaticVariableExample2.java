package variableTypes;

public class NonStaticVariableExample2 {
	
	int age;
	boolean res;
	char grade;
	float roi;
	

	public static void main(String[] args) {
		System.out.println("Program Starts");
		//System.out.println(age);//we cannot access nonstatic member directly
		
				//to avoid error first we need to load all non static member to memory
				//create an object / instance
//				NonStaticVariableExample2 ref;
//				ref =new NonStaticVariableExample2();
				              //or
				NonStaticVariableExample2 ref1=new NonStaticVariableExample2();
				ref1.age=25;
				System.out.println("Default Non static varible age ="+ref1.age);
				System.out.println("Default Non static varible res ="+ref1.res);
				System.out.println("Default Non static varible grade ="+ref1.grade);
				System.out.println("Default Non static varible roi ="+ref1.roi);
				
				ref1.age=30;
				System.out.println("Default Non static varible age ="+ref1.age);
				System.out.println("Default Program Ends");
	}

}
