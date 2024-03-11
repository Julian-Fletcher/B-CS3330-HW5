package cookingStrategies;

import pizzaType.AbstractPizza;
import pizzaType.HawaiianPizza;
import pizzaType.MargheritaPizza;
import pizzaType.SupremePizza;
import pizzaType.VegetarianPizza;

public class BrickOvenCookingStrategy implements ICookingStrategy{

	public BrickOvenCookingStrategy() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean cook(AbstractPizza pizza) 
	{
		double brickOvenCookingPrice = 10;
		if(pizza instanceof MargheritaPizza)
		{
			((MargheritaPizza) pizza).setCookingPrice(brickOvenCookingPrice);
			return true;
		}
		else if(pizza instanceof VegetarianPizza)
		{
			((VegetarianPizza) pizza).setCookingPrice(brickOvenCookingPrice);
			return true;
		}
		else if(pizza instanceof HawaiianPizza)
		{
			((HawaiianPizza) pizza).setCookingPrice(brickOvenCookingPrice);
			return true;
		}
		else if(pizza instanceof SupremePizza)
		{
			((SupremePizza) pizza).setCookingPrice(brickOvenCookingPrice);
			return true;
		}
		return false;
	}
}
