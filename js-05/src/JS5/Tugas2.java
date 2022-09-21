/*
 * Created by: 21343001_ADELINA SUCIKO
 * Tugas 2 : versi JOptionPane
 * Jobsheet : 5
 */


package JS5;

import javax.swing.JOptionPane;

public class Tugas2 {

	public static void main(String[] args) {
		
		String word1="", word2="";
        
        word1 = JOptionPane.showInputDialog ("Enter Word1  ");
        word2 = JOptionPane.showInputDialog ("Enter word2  ");
        
        String msg = word1 + word2 + "Hello";
        
        JOptionPane.showMessageDialog(null, msg);
        
        System.out.println(" " +word2);
        System.out.println("Hello " +word1);
        

	}

}
