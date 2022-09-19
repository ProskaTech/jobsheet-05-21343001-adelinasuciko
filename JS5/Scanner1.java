/*
 * Created by: 21343001_ADELINA SUCIKO
 * Latihan 1
 * Jobsheet : 5
 */

package JS5;

import java.util.Scanner;

/**...4 lines*/
public class Scanner1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
        
        System.out.print("Masukan nama lengkap : ");
        String nama = in.nextLine();
        
        System.out.print("Masukan NIM: ");
        int NIM = in.nextInt();
        
        System.out.print("Masukan Nilai: ");
        float nilai = in.nextFloat();
        
        System.out.println("\nNama : " + nama );
        System.out.println("NIM : " + NIM );
        System.out.println("Nilai : " + nilai );
	}

}
