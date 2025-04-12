package letter;

import java.util.Scanner;

public class LetterNoArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Provide 1 letter: ");
		char l = sc.next().toUpperCase().charAt(0);
		char c = 'A';
		
		do {
			System.out.print(c + " ");
			c++;
		} while (c <= l);

		sc.close();
	}

}
