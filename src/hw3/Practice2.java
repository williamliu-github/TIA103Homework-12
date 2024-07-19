package hw3;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		
	// try-with method to ensure the Scanner is properly close. 
		try (Scanner sc = new Scanner(System.in)){
		
		System.out.println("開始猜數字吧！請輸入0-9任一整數。");
	
	// Math.random API -1, times 10 because 0-9 has 10 numbers.
		int i = (int)(Math.random()*10);
		int j = sc.nextInt();
	
	// Make the while loop for the incorrect answers
		while (j!=i) {
	
    // Make the while loop for the answers that fall out of 0-9 scope
		while (j<0 || j>9) {
			System.out.println("答錯了！請選擇0-9之間任一整數");
			j = sc.nextInt();
		
		} System.out.println("答錯了！再試一次吧！");
		  j = sc.nextInt();
		} 
		
		System.out.println("恭喜你答對了！");
		
		}}}


