package cookingStrategies;

import pizzaType.AbstractPizza;

public class BrickOvenCookingStrategy implements ICookingStrategy{

	public BrickOvenCookingStrategy() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean cook(AbstractPizza pizza) 
	{
		return false;
	}
}
