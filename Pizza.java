import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import java.util.*;

//a way of having custom output found on http://www.tech-recipes.com/rx/1326/java-decimal-format-to-easily-create-custom-output/
import java.text.DecimalFormat;

public class Pizza  extends Rewards implements ActionListener {
	
	
	
	
/*Rewards r = new Rewards();
 r.toString();
 */
 
	//Create panels

	static JPanel sizePanel = new JPanel();
	static JPanel radioPanel = new JPanel();
	static JPanel toppingPanel = new JPanel();
	static JPanel sidesPanel = new JPanel();
	static JPanel orderPanel = new JPanel();
	static JPanel buttonPanel = new JPanel();
	//Create radio buttons
	static JRadioButton small, medium, large, xl;
	//Create checkbox for options
	static JCheckBox pepperoni, chicken, ham, crispybacon, tikka, steak, mushrooms, pineapple, jalapenos, peppers, sweetcorn, onions;
	static JCheckBox wedges, garlic, taco, curry, cheese, nuggets;



	//create to show info for pizza
	static JTextArea orderText = new JTextArea(10,20);
	//create to show cust info
	static JTextArea infoText = new JTextArea(10,20);
	//create buttons
	static JButton order = new JButton("Add to Order");
	static JButton submit = new JButton("Submit Order");
	static JButton cancel = new JButton("Reset");
	static JButton quit = new JButton("Exit");
	//create menubar
	JMenuBar menubar = new JMenuBar();
	JMenu filemenu = new JMenu("File");
	JMenuItem exit = new JMenuItem("Exit");
	//set prices
	static double total = 0.0;
	static double smallPizza = 7.0;
	static double medPizza = 10.0;
	static double largePizza = 14.0;
	static double xlPizza = 20.0;
	//static String address;
	
	//create this as shortcut to having 2 numbers after the .
	DecimalFormat twoDigits = new DecimalFormat ("0.00");
	
	public static void includeSizes() {
		
		BorderLayout size = new BorderLayout();
		sizePanel.setLayout(size);
		
		//looked up on how best to use radio buttons by using buttongroup https://docs.oracle.com/javase/tutorial/uiswing/components/buttongroup.html
		ButtonGroup sizes = new ButtonGroup();
		
		//create radio button
		small = new JRadioButton("Small: €7"); 
		//set the small pizza to be chosen at the start	
		small.setSelected(true);
		//add button to the radio panel
		radioPanel.add(small);
		//add small to the sizes
		sizes.add(small);
		
		medium = new JRadioButton("Medium: €10");
		radioPanel.add(medium);
		sizes.add(medium);
		
		large = new JRadioButton("Large: €14");
		radioPanel.add(large);
		sizes.add(large);
		
		xl = new JRadioButton("Extra Large: €18");
		radioPanel.add(xl);
		sizes.add(xl);
		sizePanel.add(radioPanel, BorderLayout.NORTH);
	}	
		
		public static void includeToppings() {
			
			
			
			GridLayout gl = new GridLayout(3,3);
		//sets the toppings menu to a 3,3 size
			toppingPanel.setLayout(gl);
			
			
			pepperoni = new JCheckBox("Pepperoni");
			toppingPanel.add(pepperoni);
			chicken = new JCheckBox("Chicken");
			toppingPanel.add(chicken);
			ham = new JCheckBox("Ham\n");
			toppingPanel.add(ham);
			crispybacon = new JCheckBox("Crispy Bacon");
			toppingPanel.add(crispybacon);
			tikka = new JCheckBox("Chicken Tikka");
			toppingPanel.add(tikka);
			steak = new JCheckBox("Steak");
			toppingPanel.add(steak);
			mushrooms = new JCheckBox("Mushroom");
			toppingPanel.add(mushrooms);
			pineapple = new JCheckBox("Pineapple");
			toppingPanel.add(pineapple);
			onions = new JCheckBox("Onions");
			toppingPanel.add(onions);
			sweetcorn = new JCheckBox("Sweetcorn");
			toppingPanel.add(sweetcorn);
			jalapenos = new JCheckBox("Jalapenos");
			toppingPanel.add(jalapenos);
			peppers = new JCheckBox("Peppers");
			toppingPanel.add(peppers);

		}
		
		public static void includeSides() {
			
			GridLayout ss = new GridLayout(3,3);
			sidesPanel.setLayout(ss);
			
			garlic = new JCheckBox("Garlic Bread");
			sidesPanel.add(garlic);
			wedges = new JCheckBox("Potato Wedges");
			sidesPanel.add(wedges);
			taco = new JCheckBox("Taco Fries");
			sidesPanel.add(taco);
			curry = new JCheckBox("Curry Fries");
			sidesPanel.add(curry);
			cheese = new JCheckBox("Cheese Fries");
			sidesPanel.add(cheese);
			nuggets = new JCheckBox("Chicken Nuggets");
			sidesPanel.add(nuggets);
		/*	burger = new JCheckBox("Quarter Pounder");
			sidesPanel.add(burger);
			breastbun = new JCheckBox("Breast in a Bun");
			sidesPanel.add(breastbun);
			coke = new JCheckBox("Coca Cola");
			sidesPanel.add(coke);
			fanta = new JCheckBox("Fanta Orange");
			sidesPanel.add(fanta);
			cookies = new JCheckBox("Cookies");
			sidesPanel.add(cookies);
			icecream = new JCheckBox("Ice Cream");
			sidesPanel.add(icecream);
		*/	
		}
		
		//to make borders for outside of the options https://docs.oracle.com/javase/tutorial/uiswing/components/border.html
		public static void includeBorders() {
		
			Border b1 = BorderFactory.createTitledBorder("Sizes");
			sizePanel.setBorder(b1);
			
			Border b2 = BorderFactory.createTitledBorder("Toppings");
			toppingPanel.setBorder(b2);
				
			Border b3 = BorderFactory.createTitledBorder("Side Orders");
			sidesPanel.setBorder(b3);
		}
		//to determine the total price by checking what was selected and adding on
		public void findPrice() {
			String pizzaOrder = "Pizza size:\n";
			String sideOrder = "Your sides:\n";
			double total = 0.00;
			double size = 0.00;
			double sides = 0.00;
			double toppings = 0.00;
			
			//used if to find whch was selected
			if (small.isSelected())
			{
				size += smallPizza;
				pizzaOrder += "Small (9 inches) with ;\n"; }
			else
			if (medium.isSelected()) {
				size += medPizza;
				pizzaOrder += "Medium ( 12 inches) with;\n"; }	
			else
			if (large.isSelected()) {
				size += largePizza;
				pizzaOrder +="Large (15 Inches) with;\n"; }
			else
			if (xl.isSelected()) {
				size += xlPizza;
				pizzaOrder +="Extra Large (18 Inches) with;\n" ; }
				
			if (pepperoni.isSelected()) {
				pizzaOrder += "Pepperoni\n";
				toppings += 0.50;}
			if (chicken.isSelected()) {
				pizzaOrder += "Chicken\n";
				toppings += 0.50;}
			if (ham.isSelected()) {
				pizzaOrder += "Ham\n";
				toppings += 0.50; }
			if (crispybacon.isSelected()) {
				pizzaOrder += "Crispy Bacon\n";
				toppings += 0.50;}
			if (tikka.isSelected()) {
				pizzaOrder += "Chicken Tikka\n";
				toppings += 0.50;}
			if (steak.isSelected()) {
				pizzaOrder += "Steak\n";
				toppings += 0.50;}
			if (mushrooms.isSelected()) {
				pizzaOrder += "Mushroom\n";
				toppings += 0.50;}
			if (pineapple.isSelected()) {
				pizzaOrder += "Pineapple\n";
				toppings += 0.50;}
			if (onions.isSelected()) {
				pizzaOrder += "Onions\n";
				toppings += 0.50;}
			if (sweetcorn.isSelected()) {
				pizzaOrder += "Sweetcorn\n";
				toppings += 0.50;}
			if (jalapenos.isSelected()) {
				pizzaOrder += "Jalapenos\n";
				toppings += 0.50;}
			if (peppers.isSelected()) {
				pizzaOrder += "Peppers\n";
				toppings += 0.50;}
				
			if (wedges.isSelected()) {
				sideOrder += "Wedges\n";
				sides += 3.5;}	
			if (garlic.isSelected()) {
				sideOrder += "Garlic Bread\n";
				sides += 5.0;}
			if (taco.isSelected()) {
				sideOrder += "Taco Fries\n";
				sides += 4.50;}
			if (curry.isSelected()) {
				sideOrder += "Curry Fries\n";
				sides += 4.50;}
			if (cheese.isSelected()) {
				sideOrder += "Cheese Fries\n";
				sides += 4.50;}
			if (nuggets.isSelected()) {
				sideOrder += " Chicken Strips";
				sides += 4.50;}

			
			total = size + toppings + sides;
			
			orderText.setText(pizzaOrder + " \n" + sideOrder + "\nYour subtotal is: €" + twoDigits.format(total));

		}
		
		public void reset() {
			//resets all my values
			orderText.setText("");
			
			pepperoni.setSelected(false);
			mushrooms.setSelected(false);
			pineapple.setSelected(false);
			onions.setSelected(false);
			sweetcorn.setSelected(false);
			jalapenos.setSelected(false);
			peppers.setSelected(false);
			chicken.setSelected(false);
			ham.setSelected(false);
			tikka.setSelected(false);
			steak.setSelected(false);
			crispybacon.setSelected(false);
			wedges.setSelected(false);
			garlic.setSelected(false);
			taco.setSelected(false);
			curry.setSelected(false);
			cheese.setSelected(false);
			nuggets.setSelected(false);
			small.setSelected(true);
			medium.setSelected(false);
			large.setSelected(false);
			xl.setSelected(false);
			
			total = 0.0;
		}
		
		public void quit() {
			
			System.exit(0);
		}
		
	public void submit() {
		
			JFrame confirm = new JFrame();
    		String message = "The order will be sent to your given address";
    		//checking the user answer and displaying message or resetting
    		int answer = JOptionPane.showConfirmDialog(confirm, message);
    		if (answer == JOptionPane.YES_OPTION) {
      		JOptionPane.showMessageDialog(null, "Your order is on the way ");
    		} else if (answer == JOptionPane.NO_OPTION) {
    			reset();
    		}
		}
		
		public void exit() {
		
		System.exit(0);
	}
		public void display() {
			JFrame frame = new JFrame("Pizza Orders");
			Container container = frame.getContentPane();
			//X axis means vertical 
			BoxLayout box = new BoxLayout(container, BoxLayout.Y_AXIS);
			container.setLayout(box);
			
		//	banner.setIcon(logo);
		//	logoPanel.add(banner);
	
	
			// calls the methods i created
			includeBorders();
			includeToppings();
			includeSizes();
			includeSides();
		
		//adds exit under the file in the menu strip
			filemenu.add(exit);
			
			
			//links actionlistener to the buttons so they perform actions
			order.addActionListener(this);
			cancel.addActionListener(this);
			quit.addActionListener(this);
			submit.addActionListener(this);
			exit.addActionListener(this);

		//adds file to menu strip
			menubar.add(filemenu);
			
			//adds the text box to the order panel
			orderPanel.add(orderText);
			orderPanel.add(infoText);
			
			//adds my buttons
			buttonPanel.add(order);
			buttonPanel.add(submit);
			buttonPanel.add(cancel);
			buttonPanel.add(quit);
			
	
		// adds the panels to the containers	
			container.add(sizePanel);
			container.add(toppingPanel);
			container.add(sidesPanel);
			container.add(orderPanel);
			container.add(buttonPanel);
			
			
			
			frame.setJMenuBar(menubar);
			frame.setSize(300,300);
			frame.setVisible(true);
			frame.setResizable(false);
		//found how to use pack on http://docs.oracle.com/javase/6/docs/api/java/awt/Window.html#pack%28%29
			frame.pack();
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		
		//sets the actions behind the buttons
		public void actionPerformed(ActionEvent action) {
			if (action.getSource() == cancel)
				reset();
			else
			if (action.getSource() == order)
				findPrice();
			else
			if (action.getSource() == quit)
				quit();
			if (action.getSource() == exit)
			exit();
		else
			if (action.getSource() == submit)
				submit();
		}
	

		
		 public static void main (String[] args) {
   
         Customer  customer;
        LinkedList<Customer>cust; // declare a list of customers
		
        //Create the list, then add members to it
        cust = new LinkedList<Customer>( );
        
         
        
       
        customer = new Customer();
         customer.setName(JOptionPane.showInputDialog("enter name :")); 
     	 customer.setAddress(JOptionPane.showInputDialog("enter address :"));
         customer.setAge(Integer.parseInt(JOptionPane.showInputDialog(null,"Enter age:")));
    	 cust.add(customer);



        // display the list, using an iterator
        Iterator<Customer> iterator = cust.iterator();
        while (iterator.hasNext()) {
            customer = iterator.next();
           // System.out.println( customer.getName( ));
           // System.out.println(customer.getName());
          //  System.out.println(customer.getAddress());
          //  System.out.println(customer.getAge());	
        infoText.append( "Your name is " + customer.getName() + "\n");
        infoText.append( "Your address is " + customer.getAddress() + "\n");
        infoText.append( "Your age is " + customer.getAge() + "\n");
//        infoText.append("Your loyalty points are :" + getrewardPoints());	
        	
        	
        		Pizza app = new Pizza();
				app.display();
            
        }
    }
}

		
		