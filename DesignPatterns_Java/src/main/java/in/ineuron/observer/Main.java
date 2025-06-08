package in.ineuron.observer;

public class Main {

	public static void main(String[] args) {
		
		DeliveryData topic= new DeliveryData();
		Observer obj1= new Seller();
		Observer obj2= new User();
		Observer obj3= new DeliveryCompany();
		
		topic.register(obj1);
		topic.register(obj2);
		topic.register(obj3);
		
		topic.locationChanges("xx");
		System.out.println("*************************");
		topic.unRegister(obj3);
		topic.locationChanges("yy");
	}

}
