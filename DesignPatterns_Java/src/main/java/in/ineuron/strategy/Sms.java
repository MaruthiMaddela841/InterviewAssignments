package in.ineuron.strategy;

public class Sms extends Notification{

	Sms(EncryptionStrategy encryptionStrategy, CompressStrategy compressStrategy) {
		super(encryptionStrategy, compressStrategy);
	}

	@Override
	public void send() {
		System.out.println("Sms Notification");
	}

}
