package hw1;

public class Practice5 {
	public static void main(String[]args) {
		//Step1. 先算出利率公式（Google)
		//Money accumulated = principal Mathpow.((1+interestRate),year)
		
		
		//Step2. list out the number
		double interestRate= 0.02;
		double principal  = 1_500_000; 
		double years = 10;
		
		double totalEarning = principal*Math.pow((1+interestRate),years);
		
		System.out.println(years+"年後");
		System.out.printf("本金＋利息= %.2f ",totalEarning);
		
		
		
		
		

}
	}
