/** Models a student,inherits from Person*/
public class Rewards extends Customer {

  private String studentNumber;
  private String course;							 		
  		
  public Rewards() {
  
	    super();
	    setStudentNumber("Unknown");
	    setCourse("Unassigned");
  }

  public Rewards(String snum,String c, String name,int age, String address){
	     //new Person(name,age,gender);
	     super(name,age,address);
	     //setName(name);
	     //setAge(age);
	     //setGender(gender);
	     setStudentNumber(snum);
	     setCourse(c);
  }

  public String getStudentNumber(){
	     return studentNumber;
  }

  public String getCourse() {
	     return course;
  }

  public void setStudentNumber(String snum){
	     studentNumber=snum;
  }

  public void setCourse(String c){
	     course=c;
  }
  
 /* public String toString(){
	     return "Student Number is " + getStudentNumber() + 
	     "\nCourse is " + getCourse() + 
	     "\nName is " + getName() +
	     "\nAge is " + getAge() +
	     "\nGender is " + getGender();
  }	*/
  	// alternative way to write subclass toString()
  	  public String toString(){
	     return "Student Number is " + getStudentNumber() + 
	     "\nCourse is " + getCourse() + 
	     "\nOther details: " + super.toString();
   } 
   	
   	//sets the person with not given variables
   	public static void main (String args[]){
   		Customer v1 = new Customer();
   		System.out.println(v1.toString());
   	}
   	
   	/*
   public String hug(int x){
   	
   	return "You've benn hugged " +x+ " times";
   	
   }
   	public String kiss(int x){
   	
   	return "Get Lost";
   	
   }
  */
    		
}