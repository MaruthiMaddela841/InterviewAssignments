package in.ineuron.observer;

public class Main {

	public static void main(String[] args) {
		// Design Pattern where one object automatically notifies multiple other
		// objects whenever any change or event occurs
		
		//Example One
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
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("*************************");
		System.out.println("*************************");
		
		//Example Two
		YoutubeSubscriber maru= new YoutubeSubscriber("Maru",123);
		YoutubeSubscriber mike= new YoutubeSubscriber("Mike",324);
		YoutubeSubscriber jacob= new YoutubeSubscriber("Jacob",299);
		
		YoutubeChannel channel= new YoutubeChannel("Maru's Space");
		channel.subscribe(maru);
		channel.subscribe(mike);
		channel.subscribe(jacob);
		
		channel.uploadVideo("Black Hole 101", "blackhole.mp4");
		channel.unsubscribe(jacob);
		channel.uploadVideo("Friends cast now and then","friends.mp4");
		
	}

}
