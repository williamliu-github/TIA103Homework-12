package hw7;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Practice4 {
	public static void main(String[]args) {

		// Step1. create the data folder if date folder does not exist
		File data = new File("/Users/william/Documents/06. Tibame/01. JAVA/data");
        if (!data.exists()) {
            data.mkdir();
        }
        
        
        // Step2. use dog and cat class to create 2 objects each. Also, 
        Cat kelly = new Cat("Kelly");
		Cat clarkson = new Cat ("Clarkson");
		Dog justin = new Dog("Justin");
		Dog bieber = new Dog("Bieber");
		
		
		// Step3. create the tunnel to 
		try {
			FileOutputStream fos = new FileOutputStream("/Users/william/Documents/06. Tibame/01. JAVA/data/Object.ser");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			ObjectOutputStream oos = new ObjectOutputStream(bos);
			
			oos.writeObject(kelly);
			oos.writeObject(clarkson);
			oos.writeObject(justin);
			oos.writeObject(bieber);
			
			oos.close();
			bos.close();
			fos.close();
			
			
		} catch (IOException e) {
			e.printStackTrace();
			System.out.print("Error occured: Object is not successfully written to the object.ser");
		}
		
		
		
	}

	
	
}
