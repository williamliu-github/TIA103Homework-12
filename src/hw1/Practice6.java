package hw1;

public class Practice6 {
	public static void main(String[]args) {
		int a =5;
		char b = '5';
		String c = "5";
		
		//5+5, answer = 10
		//因為兩個5皆為integar, 所以相加後會是正常的運算
		System.out.println(a+a);
		
		//5+'5', answer = 58
		//因為'5'是char, 相加之後，會將5這個字元轉成其再Unicode裡的數字為53,所以53+5=58.
		System.out.println(a+b);
		
		//5+"5", answer = 55
		//因為"5"為String, 所以兩者相加後直接轉為String
		System.out.println(a+c);
		
	}
}
