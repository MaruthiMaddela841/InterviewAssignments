package in.ineuron.strategy;

public class Push extends Notification{

	Push(EncryptionStrategy encryptionStrategy, CompressStrategy compressStrategy) {
		super(encryptionStrategy, compressStrategy);
	}

	@Override
	public void send() {
		System.out.println("Push Notification");
	}

}
