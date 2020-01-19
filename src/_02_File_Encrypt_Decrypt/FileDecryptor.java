package _02_File_Encrypt_Decrypt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

public class FileDecryptor {
	
	public static void main(String[] args) {
		
		FileEncryptor p = new FileEncryptor();
		String str = JOptionPane.showInputDialog("YESSIR");
		p.encrypt(str);
		
		try {
			
			BufferedReader b = new BufferedReader(new FileReader("src/_00_Intro_To_File_Input_and_Output/test2.txt"));
			String line = b.readLine();
			while(line != null) {
				System.out.println(line);
				line = b.readLine();
			}
			
			b.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
