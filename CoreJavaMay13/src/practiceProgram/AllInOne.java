package practiceProgram;

public class AllInOne 
{
	//globle variable
	int empID=12567;
	static int salary;
	//non static method
	int add(int a, int b) 
	{
		int res =a+b;
		return res;
	}
	//static method
	static void sub (int a, int b) 
	{	
		int res=a-b;	
	}
	
	public static void main(String[] args) 
	{
		//local variable
		int age =25;
		System.out.println("local age ="+age);
		System.out.println("local salary ="+salary);
		//object
		AllInOne ref=new AllInOne();
		System.out.println("non-static globle empID ="+ref.empID);	
		System.out.println(ref.add(10,20));
		int finslvalue=ref.add(25,35);
		System.out.println(finslvalue);
	}
}
