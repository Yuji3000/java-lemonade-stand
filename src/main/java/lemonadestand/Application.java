package lemonadestand;

import lemonadestand.model.Customer;
import lemonadestand.model.Lemonade;
import lemonadestand.model.Order;

public class Application {

	
	public static void main(String[] args) {
		
		Customer customer1 = new Customer("Will", "(111)111-1111");
		Customer customer2 = new Customer("Frank", "(222)111-1111");
		
		Order order1 = new Order(customer1);
		
		order1.addLemonade(new Lemonade(1, .5, 1, 5));
		order1.addLemonade(new Lemonade(1, .5, 1, 5));
		order1.addLemonade(new Lemonade(1, .5, 1, 5));
		order1.addLemonade(new Lemonade(1, .5, 1, 5));
		
		for (Lemonade l : order1.getLemonades()) {
			System.out.println(l.getPrice());
		}
		
		System.out.println("Name of Customer1: " + customer1.getName());
		System.out.println("Total for Customer1: " + order1.getTotal());
		
		
		System.out.println(order1.getTotal());
		
		Order order2 = new Order(customer2);
		
		order2.addLemonade(new Lemonade(1, .25, 1, 5));
		order2.addLemonade(new Lemonade(3, .5, 1, 5));
		order2.addLemonade(new Lemonade(1, .5, 4, 5));
		order2.addLemonade(new Lemonade(2, 1.5, 1.75, 5));

		System.out.println("Total for Customer 2: " + order2.getTotal());
		System.out.println(order1.equals(order2));
		
		Order order3 = order1;
		System.out.println("does order1 equal order3? " + order1.equals(order3));
		
		System.out.println(order1.toString());
	}      
	
	
}
