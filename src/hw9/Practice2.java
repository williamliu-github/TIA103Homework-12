package hw9;

public class Practice2 {
	
	/* the synchronised method saveMoney() and withdrawMoney()
	 * need to be put in the same class, as they need to share the same account*/
	
	int account;
	
	public synchronized void saveMoney() {
		for(int i=1; i<11; i++) {
		 while(account>3000) {
			 try {
				System.out.println("帳戶超過3000，媽媽停止匯款");
				wait();
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		 }
		 
		 account+=2000;
		 System.out.println("媽媽匯入2000元，此時帳戶有:"+account);
		 notify();}

		}
		
	
	
	public synchronized void withdrawMoney() {
		for(int j=1; j<11;j++) {
		while(account<2000) {
			try {
				System.out.println("帳戶餘額低於2000，熊大要求媽媽匯錢");
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
		account-=1000;
		System.out.println("熊大領出1000，剩餘餘額為:"+account);
		notify();}
		
	
		
		
		
	
		

		
	}
	
	public static void main(String[]args) {
		// we let two thread share the same practice 2 object, is because we want them to make action to the same variable account in practice 2
		Practice2 theSharedBank = new Practice2();
		Provider mom = new Provider(theSharedBank,"媽媽");
		Consumer daughter = new Consumer(theSharedBank, "女兒");
		mom.start();
		daughter.start();
		
	}
		
		
		
		
		
	}
	
class Provider extends Thread{
	Practice2 practice;
	String name;
	
	
	public Provider(Practice2 practice, String name) {
		super(name);
		this.practice = practice;

	};
	
	public void run() {
		practice.saveMoney();
		
		
	}
}


  
class Consumer extends Thread{
	Practice2 practice;
	String name;
	
	public Consumer(Practice2 practice, String name) {
		super(name);
		this.practice = practice;
	};
	
	public void run() {
		practice.withdrawMoney();
	}
}


