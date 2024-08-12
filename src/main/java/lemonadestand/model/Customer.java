package lemonadestand.model;

import java.util.Objects;

public class Customer extends Person {
	
	private String name;
	private String phoneNumber;
	
	public Customer(String name, String phoneNumber) {
		super(name);
		this.phoneNumber = phoneNumber;
	}

	
	public String getName() {
		return super.getName();
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}

	

	@Override
	public int hashCode() {
		return Objects.hash(super.getName(), phoneNumber);
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
		return Objects.equals(name, other.super.getName() && Objects.equals(phoneNumber, other.phoneNumber);
	}


	@Override
	public String toString() {
		return "Customer [name=" + super.getName() + ", phoneNumber=" + phoneNumber + "]";
	}

}
