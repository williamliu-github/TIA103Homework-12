package hw7;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.EOFException;

public class Practice5 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("/Users/william/Documents/06. Tibame/01. JAVA/data/Object.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);

            while (true) {
                try {
                    Object obj = ois.readObject();
                    if (obj instanceof Dog) {
                        Dog dog = (Dog) obj;
                        dog.speak();
                    } else if (obj instanceof Cat) {
                        Cat cat = (Cat) obj;
                        cat.speak();
                    }
                } catch (EOFException e) {
                    // End of file reached, break out of the loop
                    break;
                } catch (IOException | ClassNotFoundException e) {
                    // Handle other exceptions
                    e.printStackTrace();
                }
            }

            ois.close();
            fis.close();

        } catch (IOException e) {
            System.out.println("Input Error: Unsuccessful write in.");
            e.printStackTrace();
        }
    }
}