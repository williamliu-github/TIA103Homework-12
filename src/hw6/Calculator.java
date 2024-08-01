package hw6;

public class Calculator {
	
	/*請設計三個類別Calculator.java,CalException.java與CalTest.java,在Calculator.java裡有個自訂
方法為powerXY(int x, int y),功能是會計算x的y次方並回傳結果。 */
	
	public int powerXY (int x, int y) throws CalException {
		if (x==0 && y==0) {throw new CalException("0 to the power of 0 means nothing.");}
		return (int) Math.pow(x, y);
	}

}
