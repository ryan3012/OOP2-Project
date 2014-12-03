import java.util.*;
import javax.swing.*;

public class Customer {
	private String name;
	private int age;
	private String address;
	private LinkedList <Rewards> rewards;
	
	
	Scanner input = new Scanner (System.in);

	public int getAge() {
		String ageAsString;
		ageAsString = JOptionPane.showInputDialog("Enter age : ");
		age = Integer.parseInt(ageAsString);
//		System.out.println("Enter age");
	//	age = input.nextInt(); 
		return age;
		}
	
	public String getAddress() {
	//	System.out.println("enter address");
	//	input.nextLine();
	//	address = input.nextLine();
	address = JOptionPane.showInputDialog("Enter your address : ");
		return address;
		 }
	public String getName() {
	name = JOptionPane.showInputDialog("Enter your name : ");
		 return name;
		 }
		 
/*	public String getRewards() {
		 //loop goes through rewards linkedlist adds on rewards
		 String rewardList="";
	//	 for(String num; num<rewards.size(); num++)
		 for(int num=0; num<rewards.size(); num++);
		 
		 return rewardList;
	}
	
	/*
		 
		 
		 /*
		  * for(String str: linkedlist)
      {
    	  System.out.println(str);
      }
*/
	

	public void setAge (int age) {
		this.age = age;
	}
	
	public void setName( String name) {
				this.name = name;
	}
	
	public void setAddress(String address) {
				this.address = address;
	}
	
	public void setRewards(LinkedList <Rewards> rewards) {
				this.rewards = rewards;
	}

//	public Customer(String name, int age, String address,LinkedList <Rewards> rewards) {
		public Customer(String name, int age, String address) {
				setName(name);
				setAge(age);
				setAddress(address);
				setRewards(rewards);
	}
	

	public Customer() {
			//	this("Not Given",0,"Not Given",null);
			this("Not Given",0,"Not Given");
	}
	
		

/*	public String toString() {
				return "Your name : " + getName() +  "\n" + "Your age : " + getAge() + "\n" + "Your address : " + getAddress() + "\n" + getRewards();
	}
}
*/
public String toString() {
				return "Your name : " + getName() +  "\n" + "Your age : " + getAge() + "\n" + "Your address : " + getAddress();
	}
}