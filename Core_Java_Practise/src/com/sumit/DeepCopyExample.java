package com.sumit;

class AddressDeep implements Cloneable {
	String city;

	AddressDeep(String city) {
		this.city = city;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return new AddressDeep(this.city);
	}
}

class PersonDeep implements Cloneable {
	String name;
	AddressDeep address;

	PersonDeep(String name, AddressDeep address) {
		this.name = name;
		this.address = address;
	}

	// Overriding clone() method to perform a deep copy
	@Override
	protected Object clone() throws CloneNotSupportedException {
		PersonDeep clonedPerson = (PersonDeep) super.clone();
		clonedPerson.address = (AddressDeep) this.address.clone(); // Cloning reference object manually
		return clonedPerson;
	}
}

public class DeepCopyExample {
	public static void main(String[] args) throws CloneNotSupportedException {
		AddressDeep address = new AddressDeep("New York");
		PersonDeep person1 = new PersonDeep("John", address);

		// Cloning person1 to person2
		PersonDeep person2 = (PersonDeep) person1.clone();

		System.out.println("Before Modification:");
		System.out.println("person1 Address: " + person1.address.city);
		System.out.println("person2 Address: " + person2.address.city);

		// Modifying address of person1
		person1.address.city = "Los Angeles";

		System.out.println("After Modification:");
		System.out.println("person1 Address: " + person1.address.city);
		System.out.println("person2 Address: " + person2.address.city); // No change!
	}
}
