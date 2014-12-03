import java.util.*;
import java.io.*;

public class Rewards extends Customer  {

  private int rewardPoints;
  private String restaurant;							 		
  		
  public Rewards() {
  
	  //  super();
	    setrewardPoints(0);
	    setrestaurant("Unknown");
  }

  public Rewards(int rewpoint,String rest, String name,int age, String address){
	     
	    // super(name,age,address);
	     
	     setrewardPoints(rewpoint);
	     setrestaurant(rest);
  }

  public int getrewardPoints(){
  	 rewardPoints=100;
	     return rewardPoints;
  }

  public String getrestaurant() {
  	restaurant = "pizza place";
	     return restaurant;
  }
  
 
  
  public void setrewardPoints(int rewpoint){
	     rewardPoints=rewpoint;
  }

  public void setrestaurant(String rest){
	     restaurant=rest;
  }
  	
  public String toString(){
	     return ("Reward points earned are " + getrewardPoints() + 
	     "\nRestaurant you ate at is " + getrestaurant() + 
	     "\nName is " + getName() +
	     "\nAge is " + getAge() +
	     "\nAddress is " + getAddress());
  }
  	
  	 //alternative way to write subclass toString()
  	/*  public String toString(){
	     return super.toString() + Rewards.toString() + "Reward points earned " + getrewardPoints() + 
	     "\nYour restaurant " + getrestaurant() + 
	     "\nOther details: ";  
   } 
   	*/
   	
   	public static void main (String args[]){
   		Customer v1 = new Customer();
   		Rewards r1 = new Rewards();
   		
   		LinkedList<Rewards> rewards = new LinkedList<Rewards>();
   		
   		//this would be customer 1?
   		rewards.add(r1);
   		
   		v1.setRewards(rewards);
   		
   		
   	/*	System.out.println(rewards.toString());
   	 
			Pizza app = new Pizza();
			app.display();
	*/
   	}
   	
 
    		
}