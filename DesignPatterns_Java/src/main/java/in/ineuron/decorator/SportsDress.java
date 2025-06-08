package in.ineuron.decorator;

public class SportsDress extends DressDecorator{

	public SportsDress(Dress dress) {
		super(dress);
	}
	
	@Override
	public void assemble() {
		super.assemble();
		System.out.println("Adding Sports Dress Features");
	}

}
