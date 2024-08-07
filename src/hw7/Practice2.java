package hw7;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Practice2 {
	public static void main(String[]args) {
		randomNumber10();}
		

	public static void randomNumber10() {
		

		try {
			
	// Step 1. Prepare the Output Steam tunnels
			
			FileOutputStream fos = new FileOutputStream("/Users/william/Documents/06. Tibame/01. JAVA/TIA103Homework-12/src/hw7/Data.txt",true);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			PrintStream ps = new PrintStream(bos);
			
				
	// Step 2. Create the method that can generate and print out 10 random numbers between 1~1000	

				
		int[] randomNumber = new int[10];
				
		for (int i =0; i<=9; i++) {
		randomNumber[i]=(int)(Math.random()*1000)+1;
		ps.print(randomNumber[i]+"\t");}
			
		ps.close();
		bos.close();
		fos.close();
			
			} catch (IOException e) {
			e.printStackTrace();
		}}}
		


			
		
		
	


