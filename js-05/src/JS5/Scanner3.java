/*
 * Created by: 21343001_ADELINA SUCIKO
 * Tugas 1 : class Scanner
 * Jobsheet 5
 */

package JS5;

import java.util.Scanner;

public class Scanner3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Scanner in = new Scanner(System.in)) {
			System.out.print("Enter word1: ");
			String word1 = in.nextLine();
			
			System.out.print("Enter word2: ");
			String word2 = in.nextLine();
			
			System.out.print("Enter word3: ");
			String word3 = in.nextLine();
			
			System.out.println(word1+word2+word3);
		}
		

	}

}
