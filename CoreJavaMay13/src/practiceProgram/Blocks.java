package practiceProgram;

public class Blocks {
	
	int a;
	static int b;

	static
	{
	System.out.println("Hello JAVA Its Static block ");	
	b=15;
	System.out.println("Static Variable = "+b);
	Blocks a=new Blocks();
	a.a=10;
	System.out.println("Non-Static Variable = "+a.a);
	}
	
	{
	System.out.println("Hello JAVA Its Non-Static block ");	
	}
	public static void main(String[] args) {
	System.out.println("Program Start");	
    
	System.out.println("Program Ends");
	}

}
