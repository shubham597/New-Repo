package conditions;

public class IfCondition3 {
	public static void main(String[] args) {
		// Creating two variables for age and weight
		int age = 18;
		int weight = 45;
		// applying condition on age and weight
		if (age >= 18) {
			if (weight > 50) {
				System.out.println("You are eligible to donate blood");
			} else {
				System.out.println("You are not eligible to donate blood");
			}
		}else {
			System.out.println("You are not eligible to donate blood, as your age is below 18");
		}
	}

}
