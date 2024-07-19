package hw1;

public class Practice3 {
	public static void main(String[]args) {
		//step.1 先算出1天, 1小時, 1分等於多少秒
		int minute = 60;
		int hour = 60*60;
		int day = 60*60*24;
		int questions = 256559;
		
		//step.2 再將256559依順序:
		// 1. 除以天，在算出餘數
		int day1= questions/ day;
		int remaining1= questions%day;
		
		// 2. 用項目1的餘數除以小時，再算出餘數
		int hour1=remaining1/hour;
		int remaining2 = remaining1%hour;
		
		// 3. 用項目2的餘數除以分，再算出餘數
		int minute1=remaining2/minute;
		int second1=remaining2%minute;
		
		// 4. 剩下的就為秒,在全部拼揍
		System.out.println("256559是");
		System.out.println(day1+"天"+hour1+"小時"+minute1+"分鐘"+second1+"秒");
		
		
	}

}
