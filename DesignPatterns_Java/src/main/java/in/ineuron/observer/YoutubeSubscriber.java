package in.ineuron.observer;

public class YoutubeSubscriber implements Subscriber{
	
	private String name;
	private int id;
	
	public YoutubeSubscriber(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	public void getNotified(YoutubeChannel channel) {
		System.out.println("Hi "+name);
		System.out.println(channel.getChannelName()+" has uploaded a new video:"+channel.getVideoTitle());
	}
}
