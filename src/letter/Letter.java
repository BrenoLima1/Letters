package letter;

import java.util.Scanner;

public class Letter {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		char[] letters = new char[] {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L',
				'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		
		System.out.print("provide 1 letter: ");
		char n = sc.next().toUpperCase().charAt(0);
		int i = 0;
		do {
			System.out.print(letters[i]);
			System.out.print(' ');
			i++;
		} while (letters[i-1] < n && i < letters.length);

		sc.close();
	}

}

