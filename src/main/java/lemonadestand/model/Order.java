package lemonadestand.model;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Order {

	private Customer customer;
	
	private Set<Lemonade> lemonades;
	
	private double total;
	// default value is 0.0

	public Order(Customer customer) {
		super();
		this.customer = customer;
		lemonades = new HashSet<>();
		total = 0.0;
	}
	
	public void addLemonade(Lemonade lemonade) {
		if (lemonades.add(lemonade)) {
			total += lemonade.getPrice();			
		}
	}
	
	
	public void addLemonades(Set<Lemonade> lemonades) {
		this.lemonades.addAll(lemonades);
		for (Lemonade l : lemonades ) {
			total += l.getPrice();
		}
	}
	
	public Customer getCustomer() {
		return customer;
	}

	public Set<Lemonade> getLemonades() {
//		return lemonades.toArray(new Lemonade[lemonades.size()]);
		return lemonades;
	}

	public double getTotal() {
		return total;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result +lemonades.hashCode();
		result = prime * result + Objects.hash(customer, total);
		return result;
	}

//	Order other = (Order) obj;
//	This is an instance of casting(down casting). Being treated like its actual class
//	Object obj - instance of up casting, being treated like this parent class
	
	
	
	@Override
	   public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Order other = (Order) obj;
        return Objects.equals(customer, other.customer)
                && Objects.equals(lemonades, other.lemonades)
                && Double.doubleToLongBits(total) == Double.doubleToLongBits(other.total);
    }

	    @Override
	    public String toString() {
	        return "Order [customer=" + customer + ", lemonades=" + lemonades + ", total=" + total + "]";
	    }

	
}
