package cookingStrategies;

import pizzaType.AbstractPizza;
import pizzaType.HawaiianPizza;
import pizzaType.MargheritaPizza;
import pizzaType.SupremePizza;
import pizzaType.VegetarianPizza;

public class ConventionalOvenCookingStrategy implements ICookingStrategy{

	public ConventionalOvenCookingStrategy() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean cook(AbstractPizza pizza) 
	{
		double conventionalOvenCookingPrice = 8;
		if(pizza instanceof MargheritaPizza)
		{
			((MargheritaPizza) pizza).setCookingPrice(conventionalOvenCookingPrice);
			return true;
		}
		else if(pizza instanceof VegetarianPizza)
		{
			((VegetarianPizza) pizza).setCookingPrice(conventionalOvenCookingPrice);
			return true;
		}
		else if(pizza instanceof HawaiianPizza)
		{
			((HawaiianPizza) pizza).setCookingPrice(conventionalOvenCookingPrice);
			return true;
		}
		else if(pizza instanceof SupremePizza)
		{
			((SupremePizza) pizza).setCookingPrice(conventionalOvenCookingPrice);
			return true;
		}
		return false;
	}
}
