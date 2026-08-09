package in.ineuron.decorator;

public class Main {

	public static void main(String[] args) {
		
//		Dress sports= new SportsDress(new BasicDress());
//		sports.assemble();
//		System.out.println("*****************");
//		
//		Dress fancy= new FancyDress(new SportsDress(new BasicDress()));
//		fancy.assemble();
		
		Burger zingerBurger= new ZingerBurger();
		System.out.println(zingerBurger.getDescription() +" :"+zingerBurger.getCost()+"/-");
		
		Burger chickenBurger= new ChickenBurger();
		System.out.println(chickenBurger.getDescription() +" :"+chickenBurger.getCost()+"/-");

		BurgerDecorator ec=new ExtraCheeseBurger(chickenBurger);
		System.out.println(ec.getDescription() +" :"+ec.getCost()+"/-");
		
		BurgerDecorator em=new ExtraMayoBurger(zingerBurger);
		System.out.println(em.getDescription() +" :"+em.getCost()+"/-");
		
	}

}
