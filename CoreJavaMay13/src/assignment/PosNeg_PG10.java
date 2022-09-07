package assignment;

public class PosNeg_PG10 {
	
	void PNnum(int a) {
		if (a>0) {
			System.out.println("Positive Number ="+a);
		}else if(a==0) {
			System.out.println("Zero");
		}else if (a<0) {
			System.out.println("Negative Number ="+a);
		}
	}

	public static void main(String[] args) {
		PosNeg_PG10 a=new PosNeg_PG10();
		a.PNnum(15);

	}

}
