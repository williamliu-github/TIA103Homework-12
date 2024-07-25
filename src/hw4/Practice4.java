package hw4;

public class Practice4 {
	
// Step1. list the grades
	// (declare at class level and static so every method can have access to it)
		public static int[][] grades = {
				{ 10, 35,  40, 100, 90, 85, 75, 70},
				{ 37, 75,  77,  89, 64, 75, 70, 95},
				{100, 70,  79,  90, 75, 70, 79, 90},
				{ 77, 95,  70,  89, 60, 75, 85, 89},
				{ 98, 70,  89,  90, 75, 90, 89, 90},
				{ 90, 80, 100,  75, 50, 20, 99, 75}};
// Step2. Create a array to store winning times for each students.
	// (declare at class level and static so every method can have access to it)
		static int[] studentWins = new int[8];



// Step3. Compare students grade individually with other students	
	
	public static void main(String[]args) {
	
		for(int i=0; i<grades.length;i++) {
			if( grades[i][0] >= grades[i][0] &&
				grades[i][0] >= grades[i][1] && 
				grades[i][0] >= grades[i][2] && 
				grades[i][0] >= grades[i][3] &&
				grades[i][0] >= grades[i][4] &&
				grades[i][0] >= grades[i][5] && 
				grades[i][0] >= grades[i][6] &&
				grades[i][0] >= grades[i][7]) {studentWins[0]++;}}
		System.out.println("一號同學贏的次數"+studentWins[0]);
		
		
		for(int i=0; i<grades.length;i++) {
			if( grades[i][1] > grades[i][0] && 
				grades[i][1] > grades[i][2] && 
				grades[i][1] > grades[i][3] &&
				grades[i][1] > grades[i][4] &&
				grades[i][1] > grades[i][5] && 
				grades[i][1] > grades[i][6] &&
				grades[i][1] > grades[i][7]) {studentWins[1]++;}}
			System.out.println("二號同學贏的次數"+studentWins[1]);
			
		for(int i=0; i<grades.length;i++) {
				if( grades[i][2] > grades[i][1] && 
					grades[i][2] > grades[i][0] && 
					grades[i][2] > grades[i][3] &&
					grades[i][2] > grades[i][4] &&
					grades[i][2] > grades[i][5] && 
					grades[i][2] > grades[i][6] &&
					grades[i][2] > grades[i][7]) {studentWins[2]++;}}
			System.out.println("三號同學贏的次數"+studentWins[2]);
			
		for(int i=0; i<grades.length;i++) {
				if( grades[i][3] > grades[i][1] && 
					grades[i][3] > grades[i][2] && 
					grades[i][3] > grades[i][0] &&
					grades[i][3] > grades[i][4] &&
					grades[i][3] > grades[i][5] && 
					grades[i][3] > grades[i][6] &&
					grades[i][3] > grades[i][7]) {studentWins[3]++;}}
			System.out.println("四號同學贏的次數"+studentWins[3]);
		
		for(int i=0; i<grades.length;i++) {
				if( grades[i][4] > grades[i][1] && 
					grades[i][4] > grades[i][2] && 
					grades[i][4] > grades[i][3] &&
					grades[i][4] > grades[i][0] &&
					grades[i][4] > grades[i][5] && 
					grades[i][4] > grades[i][6] &&
					grades[i][4] > grades[i][7]) {studentWins[4]++;}}
			System.out.println("五號同學贏的次數"+studentWins[4]);
			
		for(int i=0; i<grades.length;i++) {
				if( grades[i][5] > grades[i][1] && 
					grades[i][5] > grades[i][2] && 
					grades[i][5] > grades[i][3] &&
					grades[i][5] > grades[i][4] &&
					grades[i][5] > grades[i][0] && 
					grades[i][5] > grades[i][6] &&
					grades[i][5] > grades[i][7]) {studentWins[5]++;}}
			System.out.println("六號同學贏的次數"+studentWins[5]);
		
		for(int i=0; i<grades.length;i++) {
				if( grades[i][6] > grades[i][1] && 
					grades[i][6] > grades[i][2] && 
					grades[i][6] > grades[i][3] &&
					grades[i][6] > grades[i][4] &&
					grades[i][6] > grades[i][5] && 
					grades[i][6] > grades[i][0] &&
					grades[i][6] > grades[i][7]) {studentWins[6]++;}}
			System.out.println("七號同學贏的次數"+studentWins[6]);
		
			for(int i=0; i<grades.length;i++) {
				if( grades[i][7] > grades[i][1] && 
					grades[i][7] > grades[i][2] && 
					grades[i][7] > grades[i][3] &&
					grades[i][7] > grades[i][4] &&
					grades[i][7] > grades[i][5] && 
					grades[i][7] > grades[i][6] &&
					grades[i][7] > grades[i][0]) {studentWins[7]++;}}
			System.out.println("八號同學贏的次數"+studentWins[7]);
       
	}
	
	
}
	
		
	
	
			
			
				
		
		
			
			
		
		
	

