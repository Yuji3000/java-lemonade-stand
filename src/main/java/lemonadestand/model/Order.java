package lemonadestand.model;

import java.util.Arrays;
import java.util.Objects;

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
		total += lemonade.getPrice();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(lemonades);
		result = prime * result + Objects.hash(customer, total);
		return result;
	}

//	Order other = (Order) obj;
//	This is an instance of casting(down casting). Being treated like its actual class
//	Object obj - instance of up casting, being treated like this parent class
	
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		return Objects.equals(customer, other.customer) && Arrays.equals(lemonades, other.lemonades)
				&& Double.doubleToLongBits(total) == Double.doubleToLongBits(other.total);
	}

	@Override
	public String toString() {
		return "Order [customer=" + customer + ", lemonades=" + Arrays.toString(lemonades) + ", total=" + total + "]";
	}
	

	
}
