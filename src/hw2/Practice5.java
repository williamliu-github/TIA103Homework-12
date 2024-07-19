package hw2;

public class Practice5 {
	public static void main(String[]args) {
		
		int count = 0;
		
		System.out.println("可選的數字有");
		// Step 1. 先print 出 1- 39 的數字，直接移除40-49因為他不喜歡有4的數字
		for (int i=1; i<=39; i++) {
		
		// Step 2. 用 else if 去去除還有4的數字
		if (i!=4 && i!=14 && i!=24 && i!=34) {System.out.print(i+","); count++;}
		
		} System.out.println("\n總共有"+count+"個數字");
	
	}
}
