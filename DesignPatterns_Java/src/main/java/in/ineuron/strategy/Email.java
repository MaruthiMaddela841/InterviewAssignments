package in.ineuron.strategy;

public class Email extends Notification{
	
	Email(EncryptionStrategy encryptionStrategy, CompressStrategy compressStrategy) {
		super(encryptionStrategy, compressStrategy);
	}
	@Override
	public void send() {
		System.out.println("Email Notification");
	}

}
