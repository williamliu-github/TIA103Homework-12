package hw3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Practice3Advanced {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in);){
		 System.out.print("阿文...1-9你不想要哪個數字\n");
		 int dislikedNumber = sc.nextInt();

		 
		 while (dislikedNumber < 0 || dislikedNumber >9) {
			 System.out.println("請輸入1-9的數字");
			 dislikedNumber = sc.nextInt();}
		 
		Set<Integer> randomNumbers = new HashSet<>();
        while (randomNumbers.size() < 6) {
            int randomNumber = (int) (Math.random() * 49) + 1;
            if (randomNumber != dislikedNumber) {
                randomNumbers.add(randomNumber);
            }
            
            
        }
        System.out.println("隨機選出的號碼（排除不喜歡的號碼）:");
        for (int number : randomNumbers) {
            System.out.print(number + "\t");
			 }
			 
			 
		 }
		 
		 
	}}

	


