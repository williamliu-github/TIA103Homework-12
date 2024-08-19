package hw10;

import java.util.ArrayList;
import java.util.Collection;

public class Practice1 {
//"請設計一隻程式,用亂數產生5個介於1~100之間的整數,而輸出結果可以判斷出這5個整數為是否為質數 (提示:Math類別)")//

	
	
//Step2. create a function to determine whether the randomInteger is prime number or not and return true or false
	public static boolean isPrimeNumber(int a) {
		int count=0;
		for(int i =1; i<(a+1); i++) {
			if(a%i==0) {count+=1;}
			}
		Boolean isPrimeNumber = count==2;
		return isPrimeNumber;
		
		}

	
	public static void main(String[]args) {
		
		
// Step1. generate 5 random integer between 1~100 and put them into a slit
		Collection <Integer> numberlist = new ArrayList<>();
		for (int i =0; i<5; i++) {
			int randomInteger= (int)(Math.random()*99)+1;
			numberlist.add(randomInteger);
		}
		
		
// Step3. use for-each to take out all the numbers in the list and determine whether it is prime number
		for(int number:numberlist) {
			if(isPrimeNumber(number)) {
				System.out.println(number+"是質數。");
			} else {
				System.out.println(number+"不是質數。");
			}
		}
		
	}

}
