package hw3;

import java.util.Scanner;

public class Practice3 {
	public static void main(String[]args) {
		try(Scanner sc = new Scanner(System.in)){;
		System.out.println("阿文....1-9請輸入你討厭哪個號碼?");
		int i = sc.nextInt();
		
		
		while (i<1 || i>9) {
			System.out.println("請輸入1-9你討厭的號碼。");
			i = sc.nextInt();
		}
		
		System.out.print("謝謝。以下為你可以選擇的號碼。\n");
		for (int j=1;j<=49;j++) {
		
		// If j equals the disliked number i, skip this iteration
			if (j==i) {continue;}
			System.out.print(j+"\t");
			
		// Print a new line after every 10 numbers for better readability
           if (j % 10 == 0) {
                System.out.println();
                }
		}
		
	    
			
		}}
	
		

	}
