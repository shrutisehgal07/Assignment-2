package Week2.Ques8;
/* Create a class User that implements Serializable with fields: -
		• username
		• password (marked as transient)
		• email
	• Serialize the object to a file.
	• Deserialize it and print all field values.
	• Explain why the password value is not restored.
	*/


import java.io.*;

public class User implements Serializable {

	String username;
	transient String password;
	String email;
	
	User(String username, String password, String email){
		this.username=username;
		this.password=password;
		this.email=email;
	}
		
	public void setUsername(String username) {
		this.username=username;
	}
	public void setPassword(String password) {
		this.password=password;
	}
	public void setEmail(String email) {
		this.email=email;
	}
}

