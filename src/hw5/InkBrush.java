package hw5;

public class InkBrush extends Pen {
	public InkBrush() {};
	public InkBrush(String brand, Double price) {
		super(brand,price*0.9);	
	}
	
	public void setPrice(double price) {
		setPrice(price*0.9);
	}

	
	@Override
	public void write() {
		System.out.println("沾墨汁再寫");
	}
	
	public static void main(String[]args) {
		Pen j = new InkBrush("Montblance",1000.0);
		System.out.println("打九折的價格:"+j.getPrice());
		j.write();
		
	}

}
