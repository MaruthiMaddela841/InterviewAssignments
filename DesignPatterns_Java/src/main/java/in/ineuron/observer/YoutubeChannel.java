package in.ineuron.observer;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel {
	private String channelName;
	private String videoTitle;
	private String videoFileName;
	
	public YoutubeChannel(String channelName) {
		super();
		this.channelName = channelName;
	}
	
	public String getChannelName() {
		return channelName;
	}

	public String getVideoTitle() {
		return videoTitle;
	}

	public String getVideoFileName() {
		return videoFileName;
	}

	//one channel-many subscribers
	List<Subscriber> subscribers=new ArrayList<>();
	
	public void subscribe(YoutubeSubscriber youtubeSubscriber) {
		subscribers.add(youtubeSubscriber);
	}
	
	public  void unsubscribe(YoutubeSubscriber youtubeSubscriber) {
		subscribers.remove(youtubeSubscriber);
	}
	
	public void uploadVideo(String videoTitle, String videoFileName) {
		this.videoTitle=videoTitle;
		this.videoFileName=videoFileName;
		System.out.println(	"File with Title:"+videoTitle+" and FileName:"+videoFileName+" got uploaded");
		notifySubscriber();
	}
	
	public void notifySubscriber(){
		for(Subscriber subscriber: subscribers) {
			subscriber.getNotified(this);
		}
	}
}
