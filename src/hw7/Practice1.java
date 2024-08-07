package hw7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Practice1 {
	public static void main(String[] args) {
		
// 請寫一個程式讀取這個Sample.txt檔案,並輸出以下訊息: Sample.txt檔案共有xxx個位元組,yyy個字元,zzz列資料
		
		try {
		//Step 1. to calculate the bytes of the file --> use file.length();
			File sampleText = new File("/Users/william/Documents/06. Tibame/01. JAVA/TIA103Homework-12/src/hw7/Sample.txt");
			System.out.print("Sample.txt 檔案共有\n" + sampleText.length()+"個位元組\n");
			
			
			
		//Step 2. to calculate the characters of the file --> use String.length() to sum it up
			
			String str; //str here is the small ship that can handle the import product every single time
			int totalCharacters = 0; // the total amount of product
			int line = 0;
			
			FileReader fr = new FileReader("/Users/william/Documents/06. Tibame/01. JAVA/TIA103Homework-12/src/hw7/Sample.txt");
			try (BufferedReader br = new BufferedReader(fr)) {
				// Step 3. count how many readLine has read through to know how many lines are there for the files
				while ((str=br.readLine())!=null){
				totalCharacters += str.length();
				line +=1;}
				br.close();
				fr.close();
			}
			
			
		
		System.out.println(totalCharacters+"個字元");
			System.out.println(line+"列資料");
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
