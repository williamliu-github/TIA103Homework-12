package hw9;

public class Practice1 implements Runnable {
	public void run() {
		
		
		
		for (int bowl =1; bowl<11; bowl++) {
			
			// put the randomRestTime within the loop, so every single loop, a new rest time will be generated. 
			int randomRestTime = (int)(Math.random()*2500)+500;
			
			
			//use currentThread().getName() to print out the name for each thread. 
			System.out.println(Thread.currentThread().getName()+"吃第"+bowl+"碗飯。");
			
			if(bowl == 10) {
				System.out.println(Thread.currentThread().getName()+"吃完了!");
			}
			
			try {
					Thread.sleep(randomRestTime); 
			} catch (Exception e) {
				}
			}
		
		
		
	}
	
	

	public static void main(String[] args) {
		
		// create objects from the class, and let the class wear the thread clothes to do the run();
		Practice1 participant1 = new Practice1();
		Practice1 participant2 = new Practice1();
		Thread jennifer = new Thread(participant1,"美美的An");
		Thread mike = new Thread(participant2,"圓圓的Mike");
		
		System.out.println("--------大胃王快食比賽開始!----------");
		jennifer.start();
		mike.start();
		
		
		// use .join() to let the code behind waiting the thread to finish their run();
		try {
			jennifer.join();
			mike.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("---------大胃王快食比賽結束!----------");

	}

}
