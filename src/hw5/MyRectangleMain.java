package hw5;

public class MyRectangleMain {
  public static void main(String[]args) {
	  System.out.println("1.使用public MyRectangle()建構子建立物件,設定width, depth為10, 20");
	  MyRectangle j = new MyRectangle();
	  j.setWidth(10);
	  j.setDepth(20);
	  System.out.println("The Area is:"+(j.getArea()));
	  
	  
	  System.out.println("2.使用public MyRectangle(double width, double depth)建構子建立物件,設定width, depth為10, 20");
	  MyRectangle i = new MyRectangle(10,20);
	  System.out.println("The Area is:"+(i.getArea()));
	  
  };
}
