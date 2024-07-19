package hw2;

public class Practice7 {
	
	public static void main(String[]args) {
		char[] english = { 'A', 'B', 'C', 'D','E','F' };
	        
	     // 讓 A - F 都 run 到
	        for (int i = 0; i < english.length; i++) {
	            
	     // 讓一維列的子重複自己：注意此loop的＋＋是j
	            for (int j = 0; j <= i; j++) {
	                System.out.print(english[i]);
	            }
	     // 讓出來的每一圈換行
	            System.out.println();
	     
	}}


}
