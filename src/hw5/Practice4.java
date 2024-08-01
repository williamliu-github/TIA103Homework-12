package hw5;


public class Practice4 {
	
// Step1. Create an array to include all the possible random numbers and char	
	public static char[] randomChar= {
			'a','b','c','d','e','f','g','h','i','j','k','l',
			'm','n','o','p','q','r','s','t','u','v','w','x','y','z',
			'1','2','3','4','5','6','7','8','9','0','A','B','C','D',
			'E','F','G','H','I','J','K','L','M','N','O','P','Q','R',
			'S','T','U','V','W','X','Y','Z'};
	
// Step 2. Generate a method that can randomly pick the element within the array
// use random.math to random create a number within the length of array.length
// and use the random number generated as the index to random pick an element in the array
	public static void genAuthCode() {
		for(int i = 0; i<8 ;i++) {
			int j = (int)(Math.random()*randomChar.length);	
			System.out.print(randomChar[j]);
		}
	}
	
	public static void main (String[]args) {
	    System.out.println("本次隨機產生驗證碼為："); 
		genAuthCode();	
	}

}
