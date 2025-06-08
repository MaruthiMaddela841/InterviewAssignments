package in.ineuron.decorator;

public class Main {

	public static void main(String[] args) {
		
		Dress sports= new SportsDress(new BasicDress());
		sports.assemble();
		System.out.println("*****************");
		
		Dress fancy= new FancyDress(new SportsDress(new BasicDress()));
		fancy.assemble();

	}

}
