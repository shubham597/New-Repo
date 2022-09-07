package methods;

public class MethodWithX_ReturnType2_Calling {

	/**
	 * simple interest: roi = (p*r*t)/100;
	 * @param args
	 */
	static double getROI() {
		int p=55000, t=2;
		float r=5.5f;
		double roi=(p*r*t)/100;
		System.out.println("Principle amount is: "+p);
		System.out.println("ROI is: "+r);
		System.out.println("Duration is: "+t);
		System.out.println("Interest paid by you: "+roi);
		return roi;
	}

	static double getROI(int p,int t,float r) {
		double roi=(p*r*t)/100;
		System.out.println("Principle amount is: "+p);
		System.out.println("ROI is: "+r);
		System.out.println("Duration is: "+t);
		System.out.println("Interest paid by you: "+roi);
		return roi;
	}

	public static void main(String[] args) {
		System.out.println("Programs Starts");
		double x=getROI();
		double finalAmoutToBePaid=55000+x;
		System.out.println("Total Amount : "+finalAmoutToBePaid);

		System.out.println("************Using parameter*******************");		
		int amount=95000;
		double interest=getROI(amount, 2, 4.5f);
		double finalAmout=amount+interest;
		System.out.println("Total amount paid by you: "+finalAmout);
		System.out.println("************Using parameter2*******************");		
		interest=MethodWithX_ReturnType2_Calling.getROI(95500, 2, 4.5f);
		finalAmout=95500+interest;
		System.out.println("Total amount paid by you: "+finalAmout);
		System.out.println("Programs Ends");
	}
}
/**
when you want a method to return some value and that value need to be used for further 
operations dn use any primitive datatype as return type for a method
 */