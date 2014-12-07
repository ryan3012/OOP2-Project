import java.util.*;
import javax.swing.*;
import java.io.*;


//similar build to person class
public class Customer implements Serializable {
	private String name;
	private int age;
	private String address;

	
	


	public int getAge() { 
		return age;
		}
	
	public String getAddress() {
		return address;
		 }
		 
	public String getName() {
		 return name;
		 }
		 
	

	public void setAge (int age) {
		this.age = age;
	}
	
	public void setName( String name) {
				this.name = name;
	}
	
	public void setAddress(String address) {
				this.address = address;
	}
	

	public Customer(String name, int age, String address) {
				setName(name);
				setAge(age);
				setAddress(address);
		
	}
	

	public Customer() {
			
			this("Not Given",0,"Not Given");
	}
	
		
	public String toString() {
				return "Your name: " + getName() +  "\n" + "Your age : " + getAge() + "\n" + "Your address : " + getAddress();
	}
}