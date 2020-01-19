package _02_File_Encrypt_Decrypt;

import java.io.FileWriter;
import java.io.IOException;

public class FileEncryptor {

	public void encrypt(String s) {

		try {

			FileWriter f = new FileWriter("src/_00_Intro_To_File_Input_and_Output/test2.txt");
			f.write(s);
			f.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
