package hw10;

import java.text.DecimalFormat;

import java.util.Scanner;

public class Practice2 {
	
	/*請設計一隻程式,讓使用者可以輸入一個任意數後,可以選擇要以下列何種表示方法顯示
	 * (1)千分位
	 * (2)百分比
	 * (3)科學記號
	 * 而輸入非任意數會顯示提示訊息如圖 (提示: TestFormatter.java, Java API文件, 判斷數字可用正規表示法)
	• 補充 (依此類推):
	輸入12345,千分位為12,345,輸入123,千分位為123
	輸入0.75,百分比為75%,輸入1,結果為100%*/
	
	public static void main(String[]args) {
		try (Scanner sc = new Scanner(System.in)) {
			
			System.out.println("請輸入任一數字。");
			String answer = sc.next();
			
	//Step1. make sure the user insert numbers, not others values. 
			
			String regex = "-?\\d+(\\.\\d+)?";
			Boolean match = answer.matches(regex);
			
			while(!match) {
				System.out.println("數字輸入格式不正確，請再輸入一次。");
				answer = sc.next();
				match = answer.matches(regex); 
			}
			
	//Step2. change the string to double in order to use the decimal format function 
			Double answerNumberformat= Double.parseDouble(answer);
			
			
			
			System.out.println("欲格式化成(1)千分位(2)百分比(3)科學記號，請填入1,2,3");
			String option = sc.next();
			String regexForOption = "^[1-3]$";
			Boolean matchForOption = option.matches(regexForOption);
			
			while(!matchForOption) {
				System.out.println("您輸入的格式不正確。");
				System.out.println("欲格式化成(1)千分位(2)百分比(3)科學記號，請填入1,2,3");
				option = sc.next();
				matchForOption = option.matches(regexForOption);
			}
			
			
			
			switch(option) {
			case "1":
				DecimalFormat thousandsFormat = new DecimalFormat("#,###");
				System.out.println(thousandsFormat.format(answerNumberformat));
				break;
			case "2":
				DecimalFormat percentageFormat = new DecimalFormat("#%");
				System.out.println(percentageFormat.format(answerNumberformat));
				break;
			case "3":
				DecimalFormat sciencitificFormat = new DecimalFormat("0.###E0");
				System.out.println(sciencitificFormat.format(answerNumberformat));
				break;
				}	
				}
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	

	}
	
	


