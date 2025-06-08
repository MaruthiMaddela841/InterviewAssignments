package in.ineuron.observer;

import java.util.ArrayList;
import java.util.List;

public class DeliveryData implements Subject {

	List<Observer> list = new ArrayList<Observer>();
	private String location;

	@Override
	public void register(Observer obj) {

		list.add(obj);
	}

	@Override
	public void notifyObserver() {

		for (Observer obj : list) {
			obj.update(location);
		}

	}
	
	public void locationChanges(String lc) {
		this.location=lc;
		notifyObserver();
	}

	@Override
	public void unRegister(Observer obj) {
		list.remove(obj);

	}

}
