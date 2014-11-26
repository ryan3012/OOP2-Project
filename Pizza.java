import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class Pizza implements ActionListener {

	static JPanel logoPanel = new JPanel();
	static JPanel sizePanel = new JPanel();
	static JPanel radioPanel = new JPanel();
	static JPanel toppingPanel = new JPanel();
	static JPanel sidesPanel = new JPanel();
	static JPanel orderPanel = new JPanel();
	static JPanel buttonPanel = new JPanel();
	static JRadioButton small, medium, large, xl;
	static JCheckBox pepperoni, chicken, ham, crispybacon, tikka, steak, mushrooms, pineapple, jalapenos, peppers, sweetcorn, onions;
	static JCheckBox wedges, garlic, taco, curry, cheese, nuggets, burger, breastbun, coke, fanta, cookies, icecream;
	static ImageIcon logo = new ImageIcon("pizza hut2.png");
	static JLabel banner = new JLabel();
	static JLabel info = new JLabel();
	static JTextArea orderText = new JTextArea(10,50);
	static JButton order = new JButton("Add to Order");
	static JButton submit = new JButton("Submit Order");
	static JButton cancel = new JButton("Reset");
	static JButton quit = new JButton("Exit");
	JMenuBar menubar = new JMenuBar();
	JMenu filemenu = new JMenu("File");
	JMenuItem exit = new JMenuItem("Exit");
	
	static double total = 0.0;
	static double smallPizza = 7.0;
	static double medPizza = 10.0;
	static double largePizza = 14.0;
	static double xlPizza = 20.0;
	static String address;
	
	DecimalFormat twoDigits = new DecimalFormat ("0.00");
	
	public static void includeSizes() {
		
		BorderLayout size = new BorderLayout();
		sizePanel.setLayout(size);
		
		ButtonGroup sizes = new ButtonGroup();
		
		small = new JRadioButton("Small: €7"); 
		small.setSelected(true);
		radioPanel.add(small);
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
			
			//info = new JLabel("Toppings are 50c each\n");
			GridLayout gl = new GridLayout(3,3);
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
			burger = new JCheckBox("Quarter Pounder");
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
			
		}
		
		public static void includeBorders() {
			Border b1 = BorderFactory.createTitledBorder("Sizes");
			sizePanel.setBorder(b1);
			
			Border b2 = BorderFactory.createTitledBorder("Toppings");
			toppingPanel.setBorder(b2);
				
			Border b3 = BorderFactory.createTitledBorder("Side Orders");
			sidesPanel.setBorder(b3);
		}

		public void findPrice() {
			String pizzaOrder = "Pizza size:\n";
			String sideOrder = "Your sides:\n";
			double total = 0.00;
			double size = 0.00;
			double sides = 0.00;
			double toppings = 0.00;
			
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
			if (burger.isSelected()) {
				sideOrder += "Hamburger\n";
				sides += 4.50;}
			if (breastbun.isSelected()) {
				sideOrder += "Breast N Bun\n";
				sides += 4.50;}
			if (coke.isSelected()) {
				sideOrder += "Coke\n";
				sides += 2.00;}
			if (fanta.isSelected()) {
				sideOrder += "Fanta\n";
				sides += 4.50;}
			if (cookies.isSelected()) {
				sideOrder += "Cookies\n";
				sides += 2.50;}
			if (icecream.isSelected()) {
				sideOrder += "Ice Cream\n";
				sides += 2.50;}
			
			total = size + toppings + sides;
			
			orderText.setText(pizzaOrder + " \n" + sideOrder + "\nYour subtotal is: €" + twoDigits.format(total));
		}
		
		public void reset() {
			
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
			burger.setSelected(false);
			breastbun.setSelected(false);
			coke.setSelected(false);
			fanta.setSelected(false);
			cookies.setSelected(false);
			icecream.setSelected(false);

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
    		String message = "Are you sure you want to order?";
    		int answer = JOptionPane.showConfirmDialog(confirm, message);
    		if (answer == JOptionPane.YES_OPTION) {
      		//JOptionPane.showMessageDialog(null, "Your order is: " +);
    		} else if (answer == JOptionPane.NO_OPTION) {
    			reset();
    		}
		}
		
		public void exit() {
		
		System.exit(0);
	}
		public void display() {
			JFrame frame = new JFrame("Pizza Orders");
			//JFrame = frame.setFont(Color.BLUE);
			Container container = frame.getContentPane();
			BoxLayout box = new BoxLayout(container, BoxLayout.Y_AXIS);
			container.setLayout(box);
			
			banner.setIcon(logo);
			logoPanel.add(banner);
	
			includeBorders();
			includeToppings();
			includeSizes();
			includeSides();
		
			filemenu.add(exit);
			
			order.addActionListener(this);
			cancel.addActionListener(this);
			quit.addActionListener(this);
			submit.addActionListener(this);
			exit.addActionListener(this);

			menubar.add(filemenu);
			orderPanel.add(orderText);
			
			buttonPanel.add(order);
			buttonPanel.add(submit);
			buttonPanel.add(cancel);
			buttonPanel.add(quit);
			
			container.add(logoPanel);
			container.add(sizePanel);
			container.add(toppingPanel);
			container.add(sidesPanel);
			container.add(orderPanel);
			container.add(buttonPanel);
			
			frame.setJMenuBar(menubar);
			frame.setSize(300,300);
			frame.setVisible(true);
			frame.setResizable(false);
			frame.pack();
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		
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
			Pizza app = new Pizza();
			app.display();
		}
		}