package Week2.Ques8;

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

