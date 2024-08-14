package lemonadestand.model;

import java.util.Objects;

public class Customer implements Person {
	
	private String phoneNumber;
	private String name;
	
	public Customer(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	

	public String getPhoneNumber() {
		return phoneNumber;
	}

	
	public String getName() {
		return name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(getName(), phoneNumber);
	}





	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(name, other.name) && Objects.equals(phoneNumber, other.phoneNumber);
	}


	@Override
	public String toString() {
		return "Customer [name=" + getName() + ", phoneNumber=" + phoneNumber + "]";
	}

}
