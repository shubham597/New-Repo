package variableTypes;

public class AllInOneVarible {
	
	static int empID;
	double salary;
	

	public static void main(String[] args) {
		System.out.println("Program Starts");
		
		int age=25;
		System.out.println("Age ="+age);
		
		System.out.println("*************************Accing Static varible***************************");
		
		System.out.println("initial static GV :"+ empID);
		AllInOneVarible.empID=101;
		System.out.println("Updated static GV :"+ empID);
		
		System.out.println("*************************Accing Non-Static varible***************************");
		
		AllInOneVarible ref1= new AllInOneVarible();
		System.out.println("initial non static globle varible ="+ref1.salary);
		ref1.salary=95000;
		System.out.println("Updated non static globle varible ="+ref1.salary);
		
		System.out.println("*************************New Instance Of the class***************************");
		AllInOneVarible ref2= new AllInOneVarible();
		System.out.println("initial non static globle varible ="+ref2.salary);
		System.out.println("***********************************************************************");
		System.out.println("Program Ends");

	}

}
