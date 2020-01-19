package _01_File_Recorder;

import java.io.FileWriter;
import java.io.IOException;

public class FileRecorder {
	// Create a program that takes a message from the user and saves it to a file.
	
	public static void main(String[] args) {
		
		System.out.println("working");
		
		try {
			
			FileWriter f = new FileWriter("src/_00_Intro_To_File_Input_and_Output/test2.txt");
			
			f.write("LOL EASY XD");
			
			f.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
