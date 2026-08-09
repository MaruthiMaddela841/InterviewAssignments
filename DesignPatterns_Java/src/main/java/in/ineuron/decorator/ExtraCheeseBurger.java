package in.ineuron.decorator;

public class ExtraCheeseBurger extends BurgerDecorator{
	
	Burger burger;
	
	public ExtraCheeseBurger(Burger burger) {
		this.burger=burger;
	}

	@Override
	public String getDescription() {
		return burger.getDescription()+" with extra cheese";
	}

	@Override
	public int getCost() {
		return burger.getCost()+20;
	}

}
