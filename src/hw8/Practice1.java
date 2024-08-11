package hw8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;


public class Practice1 {

	public static void main(String[] args) {
		// Step1. Create a collection
		Collection <Object> list = new ArrayList<>();
		
        // Step2. Add elements
        list.add(100); 
        list.add(3.14); 
        list.add(21L); 
        list.add(Short.valueOf("100")); // Short
        list.add(5.1); 
        list.add("Kitty"); 
        list.add(100); 
        list.add(new Object()); // Object物件
        list.add("Snoopy"); 
        list.add(new BigInteger("1000")); // BigInteger
		
		System.out.println("1. 用iterator取出 \t");
		
		Iterator<Object> itr = list.iterator();
		while(itr.hasNext()) {
			Object abc = itr.next();
			System.out.println(abc);
		};
        
      	
		System.out.println("========================");	
		System.out.println("2. 用for each取出 \t");
		
	
		for (Object each:list) {
			System.out.println(each);
		};
		
		System.out.println("=======================");	
		System.out.println("3. 用傳統for迴圈取出: \t");
		
			
		Object obj;	
		List<Object> forlist = new ArrayList<>(list); 
		// 
		for(int i = 0; i <forlist.size() ; i++) {
		obj = forlist.get(i);
		System.out.println(obj);}
		
		
		System.out.println("=======================");	
		System.out.println("4. 移除不是java.lang.Number相關的物件");
		System.out.println("5. 再次印出這個集合物件的所有元素,觀察是否已將非Number相關的物件移除成功");
		
		//Concurrent Modification: 
		//When you remove elements from a collection while iterating over it using a for-each loop, 
		//the for-each loop's iterator detects the change and throws a ConcurrentModificationException.

		
/****************************************************************************		
 * for (Object each:list) {
 *		if(each instanceof Number) {System.out.println(each);
 *		} else {
 * 			list.remove(each);
 * 		}  };       
 **************************************************************************** */                              
		

		
//An Iterator can only be used once to iterate through the collection. After the first iteration (in section 1), it is in a state where it cannot be reused to iterate again.
//To properly iterate and modify the collection, you need to create a new Iterator in section 4.
		Iterator<Object> newInterator = list.iterator();
		while(newInterator.hasNext()) {
		Object aaa = newInterator.next();
		if(aaa instanceof Number) {
			System.out.println(aaa);
		} else {
			newInterator.remove();
		}
			
		};
		
		
		
		
		
		
		
	
		
		
		
		
			
			
	}
	}


