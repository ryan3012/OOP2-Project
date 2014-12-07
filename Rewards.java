import java.util.*;
import java.io.*;

public class Rewards extends Customer  {

  private int rewardPoints;
 							 		
  		
  public Rewards() {
  
	  //  super();
	    setrewardPoints(0);
	   
  }

  public Rewards(int rewpoint){
	     
	    // super(name,age,address);
	     
	     setrewardPoints(rewpoint);
	     
  }

  public int getrewardPoints(){
  	 rewardPoints=100;
	     return rewardPoints;
  }

   
  public void setrewardPoints(int rewpoint){
	     rewardPoints=rewpoint;
	     this.rewardPoints = rewardPoints;
  }
  
  

  	
  public String toString(){
	     return ("Reward points earned are " + getrewardPoints() + 
	     "\nName is " + getName() + "\nAge is " + getAge() + "\nAddress is " + getAddress());
  }
  	
  	 //alternative way to write subclass toString()
  	/*  public String toString(){
	     return super.toString() + Rewards.toString() + "Reward points earned " + getrewardPoints() + 
	     "\nYour restaurant " + getrestaurant() + 
	     "\nOther details: ";  
   } 
   	*/
   	
   //	public static void main (String args[]){
  // 		
   	//	Rewards r1 = new Rewards();
   		
   	//	LinkedList<Rewards> rewards = new LinkedList<Rewards>();
   		
   		//this would be customer 1?
   	//	rewards.add(r1);
   		
   		//v1.setRewards(rewards);
   		
   		
   	//	System.out.println(rewards(r1));
   	 
		//	Pizza app = new Pizza();
		//	app.display();

   	}
   	
 
    		
