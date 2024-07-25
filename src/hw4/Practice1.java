package hw4;

public class Practice1 {
	public static void main(String[]args) {
        int[] array1 = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
     
        System.out.println("請算出平均值：");
        
        double sum = 0.0;
        for (int i =0; i< array1.length;i++ ){
        	sum+=array1[i];
        };
        
        double average = sum /(array1.length);
        
        System.out.println("平均值："+average);
        
        System.out.println("請列出高於平均值的元素:");
        
        for (int i=0; i<array1.length;i++) {
        	if(array1[i]>average) {System.out.print(array1[i]+"\t");}
        }
        
        System.out.println();
        
        System.out.println("請建立一個字串,經過程式執行後,輸入結果是反過來的");
        
        
        String[] array2= {"H","e","l","l","o","W","o","r","l","d"};
      
        
        for(int j=array2.length-1; j>=0;j--) {
        	System.out.print(array2[j]);
        }
        
        System.out.println();
        
// Java's array start from 0, hence if j= array2.length, array2[2] cannot locate any number.
// for instance, x[]={2,3}, if you try to locate x[2] will return errors, as 3 list in the array shall be call as x[2].
        
        System.out.println("請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)");
        
        String[] planets = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
        
        int vowelCount = 0;
        
        for (String planet : planets) {
       // enhanced for loop: create a variable planet and go through all item listed in the array planets and save in planet individually
            for (char c : planet.toCharArray()) {
       //The method toCharArray() converts the planet string into an array of characters.
       //Another enhanced for loop iterates over each character c in the character array.
                if ("aeiou".indexOf(Character.toLowerCase(c)) != -1) {
       //Character.toLowerCase(c) converts the character c to lower case.
       //"aeiou".indexOf checks if the lower case character c is one of the vowels ('a', 'e', 'i', 'o', 'u').
       //indexOf method returns the index of the first occurrence of the specified character in the string. If the character is found, it returns a value greater than or equal to 0.
       //If the character is not found, it returns -1.

                    vowelCount++;
                }
            }
        }
        
        System.out.println("Total number of vowels: " + vowelCount);
        
        
        
    
        
	
	}}
        

