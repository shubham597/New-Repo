package assignment;

public class VowelAlpha_PG7 {
	
	static void vow(char ch) {
		
		if(ch=='a') {
			System.out.println("Vowel Alphabet a");
		}
		else if (ch == 'e') {
			System.out.println("Vowel Alphabet e");
		}
		else if (ch == 'i') {
			System.out.println("Vowel Alphabet i");
			}
		else if (ch == 'o') {
			System.out.println("Vowel Alphabet o");
		}
		else if (ch == 'u') {
			System.out.println("Vowel Alphabet u");
		}
		else {
			System.out.println("This is not a vowel alphabet");
		}

	}

	public static void main(String[] args) {
		System.out.println("Program Starts");
		vow('z');
		System.out.println("Program Ends");
		
	}

}
