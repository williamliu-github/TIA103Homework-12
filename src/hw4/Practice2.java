package hw4;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[]args) {
		
// Step1: create the array, scanner and input questions to ask how much does 阿文 wants to borrow
		int[][] friendsWithMoney = {
				{25, 2500},
				{32,800},
				{8,500},
				{19,1000},
				{27,1200}};
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("阿文，你想要借多少錢？");
			int borrowedAmount = sc.nextInt();

			
//Step2. identify the employee that have enough money. Focus on array[][1] since that's where the money amount is stored in the array 
			int canBorrowed =0;
			System.out.println("有錢可借的員工編號：");
			for (int i =0; i<friendsWithMoney.length; i++) {
				
				if (friendsWithMoney[i][1]>= borrowedAmount) {
					System.out.print(friendsWithMoney[i][0]+"\t");
					canBorrowed++;}}
			
			System.out.println("總共有"+canBorrowed+"人。");
			
		} 

				
				
			}
		
		
	}

