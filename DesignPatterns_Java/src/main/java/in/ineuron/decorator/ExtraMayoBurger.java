package in.ineuron.decorator;

public class ExtraMayoBurger extends BurgerDecorator{
	
	Burger burger;
	
	public ExtraMayoBurger(Burger burger) {
		this.burger=burger;
	}

	@Override
	public String getDescription() {
		return burger.getDescription()+" with extra mayo";
	}

	@Override
	public int getCost() {
		return burger.getCost()+50;
	}

}
