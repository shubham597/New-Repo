package variableTypes;

public class NonStaticVariableExample4 {
	
	int age;
	boolean res;
	char grade;
	float roi;
	

	public static void main(String[] args) {
		System.out.println("Program Starts");
		//System.out.println(age);//we cannot access nonstatic member directly
		
		//to avoid error first we need to load all non static member to memory
		//create an object / instance
		
		NonStaticVariableExample4 ref1=new NonStaticVariableExample4();
		System.out.println("Default Non static varible age ="+ref1.age);
		System.out.println("Default Non static varible res ="+ref1.res);
		System.out.println("Default Non static varible grade ="+ref1.grade);
		System.out.println("Default Non static varible roi ="+ref1.roi);
		System.out.println("**********Updateing NonStatic Varible******************");
		ref1.age=25;
		ref1.res=true;
		ref1.grade='A';
		ref1.roi=7.5f;
		System.out.println("Updated Non static varible age ="+ref1.age);
		System.out.println("Updated Non static varible res ="+ref1.res);
		System.out.println("Updated Non static varible grade ="+ref1.grade);
		System.out.println("Updated Non static varible roi ="+ref1.roi);
		
		System.out.println("**********Updateing res2 NonStatic Varible******************");
		NonStaticVariableExample4 ref2=new NonStaticVariableExample4();
		System.out.println("Default with ref 2  Non static varible age ="+ref2.age);
		System.out.println("Default with ref 2  Non static varible res ="+ref2.res);
		System.out.println("Default with ref 2  Non static varible grade ="+ref2.grade);
		System.out.println("Default with ref 2  Non static varible roi ="+ref2.roi);
		
		
		System.out.println("Default Program Ends");

	}

}
