package hw3;

import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {
		
//Use try-with-resources to automatically close the Scanner. There is no need of the close syntax at the end
		
		try (Scanner sc = new Scanner(System.in)) {
			
			System.out.println("請輸入三角形的三邊長：");
			 int side1 = sc.nextInt(); 
			 int side2 = sc.nextInt();
			 int side3 = sc.nextInt();
			 
			 
// Call the isValidTriangle method and pass the values of side1, side2, and side3
// When calling the method, side1, side 2, side3 here are called "argument".
			 
			 if (isValidTriangle(side1, side2, side3)) {
				 if(side1 == side2 && side2 == side3) {
					 System.out.println("這是一個正三角形。");
				 } else if (side1 == side2 || side1 == side3 || side2 == side3) {
					 System.out.println("這是一個等腰三角形。");
				 } else {System.out.println("這是一個三角形。");}
			 } else {System.out.println("這不是一個三角形。");}
		} 
		}	

// Method to check if the sides form a valid triangle
// side1, side2, and side3 here are parameters to the isValidTriangle method
// They are local to this method and received the values from the main method
	
	private static boolean isValidTriangle(int side1, int side2, int side3) {
					 
		return(side1>0 && side2>0 && side3>0 &&
					 side1 + side2 > side3 &&
					 side2 + side3 > side1 &&
					 side1 + side3 > side2);
		 };
//The return statement in isValidTriangle returns a boolean value to the main method
	
}



/*Note:
 * Variable Scope and Method Parameters
In Java, when you call a method and pass arguments to it, those arguments are passed by value. This means that the values of the variables are copied into the parameters of the method being called. The variables side1, side2, and side3 in the main method are local to the main method. When isValidTriangle is called, the values of these variables are passed to isValidTriangle, where they are received as the parameters side1, side2, and side3.

Here's a step-by-step explanation:

Declaration in main Method: side1, side2, and side3 are declared and assigned values in the main method.
Method Call: The main method calls isValidTriangle(side1, side2, side3).
Parameter Passing: The values of side1, side2, and side3 from main are copied to the parameters side1, side2, and side3 of the isValidTriangle method.
Usage in Method: Inside isValidTriangle, the parameters side1, side2, and side3 are used as local variables within that method.
This is why you can use the same names in both methods without any conflict.

Return Statement
The return statement in Java serves two primary purposes:

Exiting the Method: It ends the execution of the method and returns control to the method that called it.
Returning a Value: If the method has a return type other than void, the return statement is used to provide a value back to the caller.
In the isValidTriangle method:

The return statement is used to send a boolean value (true or false) back to the caller, which in this case is the main method.
This boolean value indicates whether the sides form a valid triangle based on the conditions checked.*/

