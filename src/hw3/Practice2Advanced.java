package hw3;

import java.util.Scanner;

public class Practice2Advanced {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in);){
			System.out.println("開始猜數字吧！請輸入0-100任一整數");
			
			// Math.random times 101 because 0-100 has 101 numbers.
			int randomNumber = (int) (Math.random()*101);
			
			//System.out.println("數字是"+randomNumber); --> use to try if the code is correct.
			
			int numberGuess = sc.nextInt();
			
			
			while(numberGuess != randomNumber) {
				
			// if the numberGuess is not within 0-100 range
			while (numberGuess <0 || numberGuess>100) {
				System.out.println("請輸入0-100任整數");
				numberGuess = sc.nextInt();}
			
			
			if (numberGuess > randomNumber) {
				System.out.println("答錯了！數字要再小一點");
				numberGuess = sc.nextInt();
			} else if (numberGuess < randomNumber) {
				System.out.println("答錯了！數字要再大一點");
				numberGuess = sc.nextInt();
			}
			}
			System.out.print("恭喜！你答對了！");
			
			
				
			}
			
			
			
		}

	}


