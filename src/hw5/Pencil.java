package hw5;

public class Pencil extends Pen {
	public Pencil() {};
	
	public Pencil(String brand, double price) {
		super(brand,price*0.8);
	}
	
	public void setPrice(double price) {
		setPrice(price*0.8);
	}
	
	
	@Override
	public void write() {
		System.out.println("削鉛筆再寫。");
	}
	
	public static void main(String[]args) {
		Pen i = new Pencil("SKB",100);
		System.out.print("打八折後的價格：");
		System.out.println(i.getPrice());
		i.write();
		
		
	
		
	};

}
