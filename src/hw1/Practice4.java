package hw1;

public class Practice4 {
	public static void main(String[]args) {
		final double PI = 3.1415;
		double radius = 5.0;
		double area = PI*Math.pow(radius,2);
		double perimeter = 2*PI*radius;
		
		System.out.printf("圓面積: %.2f %n",area);
		System.out.printf("圓周長: %.2f",perimeter);
		
		
		
	}
}
