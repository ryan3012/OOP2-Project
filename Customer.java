import java.util.*;
import javax.swing.*;
import java.io.*;


/**This is an instantiable Customer class.
 @author Ryan Crane
 @version 1.0 */ 








//similar build to person class
public class Customer implements Serializable {
	private String name;
	private int age;
	private String address;

	
	

	/** acessor method to return the customer age
	 *@return the age of the customer */

	public int getAge() { 
		return age;
		}
		
		/** acessor method to return the customer address
	 *@return the address of the customer */
	
	public String getAddress() {
		return address;
		 }
		 
		 /** acessor method to return the customer name
	 *@return the name of the customer */
		 
	public String getName() {
		 return name;
		 }
		 
	
/** mutator method to set the customer age
	 *@param set the age of the customer */

	public void setAge (int age) {
		this.age = age;
	}
	/** mutator method to set the customer name
	 *@param set the name of the customer */
	public void setName( String name) {
				this.name = name;
	}
	/** mutator method to set the customer address
	 *@param set the address of the customer */
	public void setAddress(String address) {
				this.address = address;
	}
	

	public Customer(String name, int age, String address) {
				setName(name);
				setAge(age);
				setAddress(address);
		
	}
	
	/** no-args constructor
	 *  to create a default Customer */
	public Customer() {
			
			this("Not Given",0,"Not Given");
	}
	
	/** toString method to return the customer
	 *@return the name age and address of the customer */
	
	public String toString() {
				return "Your name: " + getName() +  "\n" + "Your age : " + getAge() + "\n" + "Your address : " + getAddress();
	}
}//end class