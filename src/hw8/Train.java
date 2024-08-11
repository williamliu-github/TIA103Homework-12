package hw8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

/* 請設計一個Train類別,並包含以下屬性:
- 班次 number,型別為int - 車種 type,型別為String - 出發地 start,型別為String
- 目的地 dest,型別為String - 票價 price,型別為double */

public class Train implements Comparable<Train>{
	private int number;
	private String type;
	private String start;
	private String dest;
	private double price;
	
	

//設計對應的getter/setter方法
		
	public int getNumber() {
		        return number;}
	
	public String getType() {
		return type;
	}
	
	public String getStart() {
		return start;
	}
	
	public String getDestination() {
		return dest;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public void setStart(String start) {
		this.start = start;
	}
	
	public void setDestination(String dest) {
		this.dest = dest;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	/*並在main方法裡透過建構子產生以下7個Train的物件,放到每小題
	需使用的集合裡
	- (202, “普悠瑪”, “樹林”, “花蓮”, 400)
	- (1254, “區間”, “屏東”, “基隆”, 700)
	- (118, “自強”, “高雄”, “台北”, 500)
	- (1288, “區間”, “新竹”, “基隆”, 400)
	- (122, “自強”, “台中”, “花蓮”, 600)
	- (1222, “區間”, “樹林”, 七堵, 300)
	- (1254, “區間”, “屏東”, “基隆”, 700)*/	
	
	public Train() {};
	
	public Train(int number, String type, String start, String dest, double price) {
		this.number = number;
		this.type = type;
		this.start = start;
		this.dest = dest;
		this.price = price;}
	
	
    // toString method for printing Train details
    @Override
    public String toString() {
        return "No." + number + " | "+
                type + " | " + start +"-"+ dest + " | $" + 
               price;}
        
        
    // @Override hashCode and equals to prevent the duplicate train from appearing.
    	public int hashCode() {
    		return Objects.hash(dest, number, price, start, type);
    	}

    	@Override
    	public boolean equals(Object obj) {
    		if (this == obj)
    			return true;
    		if (obj == null)
    			return false;
    		if (getClass() != obj.getClass())
    			return false;
    		Train other = (Train) obj;
    		return Objects.equals(dest, other.dest) && number == other.number
    				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
    				&& Objects.equals(start, other.start) && Objects.equals(type, other.type);}
    	
    // Implements the comparable interface and reverse the nature to big to small
    	
    	    public int compareTo(Train other) {
    	        // Ascending order
    	        int result = Integer.compare(this.number, other.number);
    	        // Reverse the order by multiplying by -1 for descending order
    	        return result * -1;
    	    
    		
    		
    }
	
	
	public static void main(String[]args) {
		Train train1 = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
		Train train2 = new Train(1254, "區間", "屏東", "基隆", 700);
		Train train3 = new Train(118, "自強", "高雄", "台北", 500);
		Train train4 = new Train(1288, "區間", "新竹", "基隆", 400);
		Train train5 = new Train(122, "自強", "台中", "花蓮", 600);
		Train train6 = new Train(1222, "區間", "樹林", "七堵", 300);
		Train train7 = new Train(1254, "區間", "屏東", "基隆", 700);
		
		
		
		
		Collection <Train> collection = new HashSet<>();
		collection.add(train1);
		collection.add(train2);
		collection.add(train3);
		collection.add(train4);
		collection.add(train5);
		collection.add(train6);
		collection.add(train7);
		
		System.out.println("請寫一隻程式,能印出不重複的Train物件");
		System.out.println("Iterator：");
		
		Iterator <Train> itr = collection.iterator();
		while(itr.hasNext()) {
			Object obj = itr.next();
			System.out.println(obj);
		}
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("for-each:");
		
		for (Object practice: collection) {
			System.out.println(practice);
		}
		
		
		
		System.out.println("======================================");
		System.out.println("請寫一隻程式,讓Train物件印出時,能以班次編號由大到小印出");

		List <Train> list = new ArrayList<>();
		list.add(train1);
		list.add(train2);
		list.add(train3);
		list.add(train4);
		list.add(train5);
		list.add(train6);
		list.add(train7);
																											
		Collections.sort(list);
		
		System.out.println("Iterator：");
		
	
		
		Iterator <Train> itr2 = list.iterator();
		while(itr2.hasNext()) {
			Object obj2 = itr2.next();
			System.out.println(obj2);}
		
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		System.out.println("for each：");
		
	    for (Train number : list) {
	    	System.out.println(number);
	    }
			
		
		System.out.println("======================================");
		System.out.println("承上,不僅能讓班次編號由大排到小印出, 還可以不重複印出Train物件");
		
		System.out.println("iterator：");
		
		Set<Train> tree = new TreeSet<>();
		tree.add(train1);
		tree.add(train2);
		tree.add(train3);
		tree.add(train4);
		tree.add(train5);
		tree.add(train6);
		tree.add(train7);
		
		Iterator <Train> itr3 = tree.iterator();
		while(itr3.hasNext()) {
			Object obj3 = itr3.next();
			System.out.println(obj3);}
		
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		System.out.println("for each：");
		
		for (Train leaf: tree) {
			System.out.println(leaf);
		}
			
	
	
		
		
		
	}
	
	

}
