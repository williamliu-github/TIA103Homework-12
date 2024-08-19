package hw10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*• 請設計一隻程式,讓使用者輸入日期(年月日,例如:20110131)後,可以轉成想要的輸出格式化成
 * (1)年/月/日
 * (2)月/日/年
 * (3)日/月/年
 * 三選一,而輸入非指定日期數字格式會顯示出提示訊息如圖
(提示:TestFormatter.java, Java API文件,判斷格式可用正規表示法)*/



/* Step1. make sure the input aligns with the expression that we want*/

public class Practice3 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入日期(年月日,例如:20110131)");
		String answer = sc.next();
		String correctFormat = "^\\d{8}$";
		Boolean match = answer.matches(correctFormat);
		while(!match) {
			System.out.println("日期格式輸入不正確，請再輸入一次");
			answer = sc.next();
			match = answer.matches(correctFormat);	
			}
		
		
		
/* Step2. turn string into a date format. Date util needs to be imported. 
 * before we can transform String into date,  we need to set the format of the date with SimpleDateFormat*
 */
		SimpleDateFormat yyyymmdd = new SimpleDateFormat("yyyymmdd");
		Date date = null;
		try {
			date = yyyymmdd.parse(answer);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		

		System.out.println("請選擇想要輸出的格式\n"
				+ "(1)年/月/日\n"
				+ "(2)月/日/年\n"
				+ "(3)日/月/年\n"
				+ "請輸入號碼1,2或3");
		
		String option = sc.next();
		String optionFormat = "^[1-3]$";
		Boolean optionMatch = option.matches(optionFormat);
		
		while(!optionMatch) {
			System.out.println("輸入的格式不正確，請輸入號碼1,2或3");
			option = sc.next();
			optionMatch = option.matches(optionFormat);
		}
		
		
		
		
		switch(option) {
		case "1":
			SimpleDateFormat yyyymmddwithslash = new SimpleDateFormat("yyyy/mm/dd");
		   System.out.println(yyyymmddwithslash.format(date));
		break;
		case "2":
			SimpleDateFormat mmddyyyy = new SimpleDateFormat("mm/dd/yyyy");
			System.out.println(mmddyyyy.format(date));
		break;
		case "3":
			SimpleDateFormat ddmmyyyy = new SimpleDateFormat("dd/mm/yyyy");
			System.out.println(ddmmyyyy.format(date));
		break;
		}
		
		
		
	}
}
