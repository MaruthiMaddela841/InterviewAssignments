package com.sumit;

//23. Can We Define an Interface Within a Class? 
//Answer: 
//Yes, you can define an interface within a class, known as a 
//nested interface. This is useful when the interface is closely 
//related to the outer class and is not intended to be used 
//elsewhere. 

//Outer class: BankATM
class BankATM {

	// Nested interface inside the class
	interface Transaction {
		void process(int amount);
	}

	// Concrete class implementing the nested interface
	class VisaCard implements Transaction {
		public void process(int amount) {
			System.out.println("Transaction of ₹" + amount + " processed using Visa Card.");
		}
	}

	class MasterCard implements Transaction {
		public void process(int amount) {
			System.out.println("Transaction of ₹" + amount + " processed using MasterCard.");
		}
	}
}

public class NestedInterfaceExample {
	public static void main(String[] args) {
		BankATM atm = new BankATM();

		// Using nested interface via inner classes
		BankATM.Transaction visaTransaction = atm.new VisaCard();
		visaTransaction.process(5000);

		BankATM.Transaction masterTransaction = atm.new MasterCard();
		masterTransaction.process(10000);
	}
}
