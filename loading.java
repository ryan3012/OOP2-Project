import java.io.*;
import java.util.*;

public class loading{

public static void main(String[] arg){

// Create the data objects for to restore them
         Customer  customer;
         LinkedList<Customer>cust; 
         cust = new LinkedList<Customer>( );
        	
        	
        Rewards rewards;
		LinkedList<Rewards>reward;
		reward = new LinkedList<Rewards>( );


	try{
	FileInputStream saveFile = new FileInputStream("SaveCust.dat");
	
	ObjectInputStream save = new ObjectInputStream(saveFile);
	
	// restore the objects
	cust = (LinkedList) save.readObject();
	reward = (LinkedList) save.readObject();
	
	// Close the file.
	save.close(); 
	}
	catch(Exception exc){
	exc.printStackTrace(); // If there was an error, print the info.
	}
	
	// Print the values, to see that they've been recovered.	
	System.out.println("\tCustomer info: ");
	System.out.println("\t\t" + cust + "\n" + reward);
	System.out.println();
	

	}
	}