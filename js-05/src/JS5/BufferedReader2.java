/*
 * Created by: 21343001_ADELINA SUCIKO
 * Tugas 1 : class BufferedReader
 * Jobsheet : 5
 */


package JS5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReader2 {

	public static void main(String[] args) {
		
BufferedReader String = new BufferedReader (new InputStreamReader (System.in));
        
        String word1, word2, word3;
        System.out.println("Program menampilkan Goodbye And Hello ");
        
        try {
            System.out.print("Enter word1: ");
            word1 = String.readLine();
            
            System.out.print("Enter word2: ");
            word2 = String.readLine();
            
            System.out.print("Enter word3 : ");
            word3 = String.readLine();
            
            System.out.println("\n");
            System.out.println(word1 + word2 + word3);
        }
        catch (IOException e){
            System.out.println("Gagal membaca keyboard");
        }


	}

}
