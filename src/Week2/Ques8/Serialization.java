package Week2.Ques8;

/* Create a class User that implements Serializable with fields: -
		• username
		• password (marked as transient)
		• email
	• Serialize the object to a file.
	• Deserialize it and print all field values.
	• Explain why the password value is not restored.*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialization {
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		
		
		User user = new User("Shruti","Abcd1234!","shrutisehgal@gmail.com");
		
		
		FileOutputStream fos = new FileOutputStream("user.ser");
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		oos.writeObject(user);
		
		oos.close();
		fos.close();
		
		FileInputStream fis = new FileInputStream("user.ser");
		ObjectInputStream ois= new ObjectInputStream(fis);
		
		User user2= (User)ois.readObject();
		
		ois.close();
		fis.close();
		
		//System.out.println(user.username +".."+ user.password +" " + user.email);
		System.out.println(user2.username);
		System.out.println(user2.password);
		System.out.println(user2.email);
		
		
		/* the transient keyword due to the safety reasons hide the actual value whenever it is used
		  and provides a null value for a string and 0 for integer to the file whenever the file is serialized.
		*/
		
	}
}
