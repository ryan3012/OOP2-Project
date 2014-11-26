/** An OOP instantiable class which models one person, storing
 *  all that person's details as one object */
public class Customer {
	private String name;
	private int age;
	private String address;
	
	// 'accessor' methods to return a copy of an attribute
	public int getAge() { return age;}
	public String getAddress() { return address;}
	public String getName() { return name;}
	
	// 'mutator' methods to change the value of an attribute
	public void setAge (int age) {
				this.age = age;
	}
	
	public void setName( String name) {
				this.name = name;
	}
	
	public void setAddress(String address) {
				this.address = address;
	}
	
	// 'constructor' methods to give people a sensible initial state
	
	/** full-args constructor, to create a person about whom everything is known
	 */
	public Customer(String name, int age, String address) {
				setName(name);
				setAge(age);
				setAddress(address);
	}
	
	/** no-args constructor, for use as in Person p = new Person()
	 *  to create a default Person
	 */
	public Customer() {
				this("Not Given",0,"Not Given");
	}
	
		
	/* Every object should have one of these, to give a quick
	 * String summary of the values of all the object's attributes
	 */
	public String toString() {
				return getName() + " " + getAge() + " " + getAddress();
	}
}