import java.util.*;
import java.io.*;

	public class Rewards   {
	
	  private int rewardPoints;
	 							 		
  		
  	public Rewards() {
	    setrewardPoints(0);
	   
 	 }

	  public Rewards(int rewpoint){
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
		     return ("Reward points earned are " + getrewardPoints());
		     
		    
	  }
	  	
	  	 
	
	   	}
	   	
	 
    		
