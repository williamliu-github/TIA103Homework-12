package hw6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest {

	public static void main(String[] args) throws CalException {
		Calculator cal = new Calculator();
		try (Scanner sc = new Scanner (System.in)) {
			int x =0; int y=0;
			boolean Validinput;
			
			do{ Validinput = true;
				try {
				do { Validinput = true; 
					System.out.println("Please enter your x value:");
						try {x = sc.nextInt();} 
						catch (InputMismatchException e){
								Validinput = false;
								System.out.println("Invalid input: Please enter an integer.");
								sc.next();}	
				} while (!Validinput);
			
				do { Validinput = true; 
					System.out.println("Please enter your y value:");
						try {y = sc.nextInt(); while(y<0) {
							System.out.println("Invalid input: negative exponent will return an non-integer result. Please enter a positive integer.");
							y= sc.nextInt();
						};} catch (InputMismatchException e){
							Validinput = false;
							System.out.println("Invalid input: Please enter a positive integer.");
							sc.next();}	
				} while (!Validinput);
			
			System.out.println(x+" to the power of "+y+" is "+cal.powerXY(x, y)); }
				catch (CalException e) {
					Validinput = false;
			        System.out.println(e.getMessage());
				}
			
			} while (!Validinput);
		}
		
		

		
		
		

	

}}
