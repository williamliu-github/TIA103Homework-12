package hw4;

import java.util.Scanner;

public class Practice3 {
	public static void main(String[]args) {

try (// Step 1. create the input questions
		Scanner sc = new Scanner(System.in)) {
			System.out.println("請輸入三個整數，分別代表西元yyyy年，mm月，dd日。");
			int[] date = {sc.nextInt(),sc.nextInt(),sc.nextInt()};
			
//Step 2. create the loop to ensure the input are following the correct format for month and day
			while(date[1]<1 || date[1]>12) {
				System.out.println("月份請輸入1-12的整數，以下請重新輸入您指定的月份:");
				date[1] = sc.nextInt();}
			while(date[2]<1 || date[2]>31) {
					System.out.println("日期請輸入1-31的整數，以下請重新輸入您指定的日期:");
				date[2] = sc.nextInt();
			}

// Step 3. create the loop to ensure that if the input for month is 2
			// when the year input can be divided by 4 (leap year) then the limit for day input shall fall between 1～29
			while (date[0]%4==0 && date[1]==2 && date[2] > 29) {
				System.out.println("請年為閏年，此年的2月入期不得超過29，請重新輸入您的日期");
				date[2] = sc.nextInt();
			}
			// when the year input cannot be divided by 4, then the limit for day input shall fall between 1~28
			while (date[0]%4!=0 && date[1]==2 && date[2] > 28) {
				System.out.println("2月日期不得超過28，請重新輸入您的日期");
				date[2] = sc.nextInt();
			}
// Step 4. Calculate the remaining dates in the year
			int dayPassed = (date[1]-1)*30+date[2];
			
			// some months have more than 30 days
			switch (date[1]) {
			case 1:
				dayPassed+=1;
				break;
			case 2:
				dayPassed+=1;
				break;
			case 3:
				dayPassed+=2;
				break;
			case 4:
				dayPassed+=2;
				break;
			case 5:
				dayPassed+=3;
				break;
			case 6:
				dayPassed+=3;
				break;
			case 7:
				dayPassed+=4;
				break;
			case 8:
				dayPassed+=5;
				break;
			case 9: 
				dayPassed+=5;
				break;
			case 10:
				dayPassed+=6;
				break;
			case 11:
				dayPassed+=6;
				break;
			case 12:
				dayPassed+=6;
				break;}
			
			// when it is leap year, February has 1 more day
			if (date[0]%4==0 && date[1]>2) {dayPassed++;}
				
			System.out.println("你數入的資訊為西元"+date[0]+"年"+date[1]+"月"+date[2]+"日");
			System.out.println("數入的日期為該年的"+dayPassed+"日");
		}
        }
       
		
		
		

}
