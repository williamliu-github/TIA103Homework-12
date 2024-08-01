package hw5;

public class Practice1Q2 {
	public static void main(String[]args) {
		randAvg();
			
	};
	
	
	
	public static void randAvg() {
			int[] randomNumber = new int[10];
			System.out.println("The 10 random numbers you got are:");
			for(int i =0; i<randomNumber.length; i++) {
				randomNumber[i] = (int)(Math.random()*101);
				System.out.print(randomNumber[i]+"\t");
			}
			
			double sum =0; 
			double average = 0;
			for(int j=0; j<randomNumber.length; j++) {
				sum+= randomNumber[j];
			}
			average = sum / randomNumber.length;
			
			System.out.println("\nThe average of these numbers is:");
			System.out.println(average);
			
			
			
			}

}
