package in.ineuron.strategy;

public abstract class Notification {
	
	EncryptionStrategy encryptionStrategy;
	CompressStrategy compressStrategy;
	
	Notification(EncryptionStrategy encryptionStrategy, CompressStrategy compressStrategy){
		this.encryptionStrategy=encryptionStrategy;
		this.compressStrategy=compressStrategy;
	}
	
	public abstract void send();
	public void compress() {
		compressStrategy.compress();
	}
	public void encrypt() {
		encryptionStrategy.encrypt();
	}
}
