package hw7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Practice3 {
	public static void main(String[]args) {};
	
	public static void copyFile(File sourceFile, File destination) {
		try {
			
	// Step 1. Create the import tunnel 
			FileReader fr = new FileReader(sourceFile);
			try (BufferedReader br = new BufferedReader(fr)) {
				
				
	// Step 2. Create the output tunnel		
			FileWriter fw = new FileWriter(destination);
			try (BufferedWriter bw = new BufferedWriter(fw)) {
				
				
	// Step 3. Connect the tunnel 
			String str; // create the string as a boat to carry the information
			while ((str = br.readLine())!=null) {
			bw.write(str);
			bw.newLine();
    // newLine() used to ensure the lines are properly separated in the destination file.
							}
						}
			}

			
		} catch (IOException e) {
			System.out.println("Error Occured. File copying failed.");
			e.printStackTrace();
		}
		
		
		
		

	}

}
