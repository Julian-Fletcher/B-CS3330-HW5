package cookingStrategies;

import pizzaType.AbstractPizza;
import pizzaType.HawaiianPizza;
import pizzaType.MargheritaPizza;
import pizzaType.SupremePizza;
import pizzaType.VegetarianPizza;

public class MicrowaveCookingStrategy implements ICookingStrategy{

	public MicrowaveCookingStrategy() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean cook(AbstractPizza pizza) 
	{
		double microwaveCookingPrice = 1;
		if(pizza instanceof MargheritaPizza)
		{
			((MargheritaPizza) pizza).setCookingPrice(microwaveCookingPrice);
			return true;
		}
		else if(pizza instanceof VegetarianPizza)
		{
			((VegetarianPizza) pizza).setCookingPrice(microwaveCookingPrice);
			return true;
		}
		else if(pizza instanceof HawaiianPizza)
		{
			((HawaiianPizza) pizza).setCookingPrice(microwaveCookingPrice);
			return true;
		}
		else if(pizza instanceof SupremePizza)
		{
			((SupremePizza) pizza).setCookingPrice(microwaveCookingPrice);
			return true;
		}
		return false;
	}
}
