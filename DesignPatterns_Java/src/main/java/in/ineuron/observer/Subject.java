package in.ineuron.observer;

public interface Subject {
	
	void register(Observer obj);
	void notifyObserver();
	void unRegister(Observer obj);

}