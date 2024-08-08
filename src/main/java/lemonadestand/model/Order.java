package lemonadestand.model;

import java.util.Arrays;

public class Order {

	private Customer customer;
	
	private Lemonade[] lemonades;
	
	private double total;
	// default value is 0.0

	public Order(Customer customer) {
		super();
		this.customer = customer;
		lemonades = new Lemonade[0];
		total = 0.0;
	}
	
	public Customer getCustomer() {
		return customer;
	}

	public Lemonade[] getLemonades() {
		return lemonades;
	}

	public double getTotal() {
		return total;
	}

	private void updateTotal() {
		total = 0;
		for (Lemonade l : lemonades) {
			// for each lemonade = l in lemonades
			total += l.getPrice();
		}
	}
	
	public void addLemonade(Lemonade lemonade) {
// with for loop
//		Lemonade[] temp = new Lemonade[lemonades.length + 1];
//		
//		for (int i = 0; i< lemonades.length; i++) {
//			temp[i] = lemonades[i];
//		}
//		temp[temp.length - 1] = lemonade;
//		lemonades = temp;
		
		
		Lemonade[] newLemonadeArray = Arrays.copyOf(lemonades, lemonades.length + 1);
		newLemonadeArray[newLemonadeArray.length - 1] = lemonade;
		lemonades = newLemonadeArray;
		updateTotal();
	}
	
	
}
