package com.sumit;

class Address {
	String city;

	Address(String city) {
		this.city = city;
	}
}

class Person implements Cloneable {
	String name;
	Address address;

	Person(String name, Address address) {
		this.name = name;
		this.address = address;
	}

	// Overriding clone() method to perform a shallow copy
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone(); // Default cloning (shallow copy)
	}
}

public class ShallowCopyExample {
	public static void main(String[] args) throws CloneNotSupportedException {
		Address address = new Address("New York");
		Person person1 = new Person("John", address);

		// Cloning person1 to person2
		Person person2 = (Person) person1.clone();

		System.out.println("Before Modification:");
		System.out.println("person1 Address: " + person1.address.city);
		System.out.println("person2 Address: " + person2.address.city);

		// Modifying address of person1
		person1.address.city = "Los Angeles";

		System.out.println("After Modification:");
		System.out.println("person1 Address: " + person1.address.city);
		System.out.println("person2 Address: " + person2.address.city); // Also changes!
	}
}
