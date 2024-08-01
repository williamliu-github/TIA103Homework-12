package hw5;

import java.util.Scanner;

public class Practice1Q1 {
  public static void main(String[]args) {
	  
	  try (// Step1. ask for user's input for his desired height and width
	Scanner sc = new Scanner(System.in)) {
		System.out.println("Please type in your desired height. The input must be a integer.");
		  int height = sc.nextInt();
		  
		  while (height <= 0) {System.out.println("Please type in the number that is bigger than zero");
		  height = sc.nextInt();}
		  
		  System.out.println("Please type in your desired width. The input must be a integer");
		  int width = sc.nextInt();
		  while (width <= 0) {System.out.println("Please type in the number that is bigger than zero");
		  width = sc.nextInt();}
		  
		  System.out.println("Desired height:"+height);
		  System.out.println("Desired width:"+width);
		  
		  //Step3. Call the method to create the shape
		  starSquare(height,width);
		  
		  
		  }
	} 
          //Step2. create a loop to print out the shape and make into a method
  			public static void starSquare(int height, int width) {
  				for (int i =0; i<height; i++) {
  				  for(int j = 0; j<width; j++) {
  					  System.out.print("*");
  				  } System.out.println();
  			}
  
	}
  
  			}
       
	  
	  
	  


