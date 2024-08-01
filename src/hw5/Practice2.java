package hw5;

public class Practice2 {		
	public int maxElement(int[][]intArray) {
			int maxIntValue = 0;
			for(int i=0; i<intArray.length; i++) {
				for(int j=0; j<intArray[i].length; j++) {
					if(maxIntValue<intArray[i][j]) {
						maxIntValue = intArray[i][j];
					} 
				}
			}
			return maxIntValue;
		}
		
	public double maxElement(double[][]doubleArray) {
			double maxDoubleValue = 0;
			for(int z=0; z<doubleArray.length; z++) {
				for(int y=0; y<doubleArray[z].length; y++) {
					if(maxDoubleValue<doubleArray[z][y]) {
						maxDoubleValue = doubleArray[z][y];
					} 
				}
			}
			return maxDoubleValue;
		}
		
		
		
	public static void main(String[]args) {
System.out.println("利用Overloading,設計兩個方法int maxElement(int x[][])與double maxElement(double x[][]),\n"
		 		+ "可以找出二維陣列的最大值並回傳");
					int[][] intArray = {
							{1,6,3},
							{9,5,2}
					};
					
					double[][] doubleArray = {
							{1.2, 3.5, 2.2},
							{7.4, 2.1, 8.2}
					};
				 Practice2 w = new Practice2();

				 System.out.println("int maxElement:"+w.maxElement(intArray));
				 System.out.println("double maxElement:"+w.maxElement(doubleArray));
				
			 }
		
}
