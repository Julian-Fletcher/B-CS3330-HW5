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
		String pizzaType;
		if(pizza instanceof MargheritaPizza)
		{
			pizzaType = "MargheritaPizza";
		}
		else if(pizza instanceof VegetarianPizza)
		{
			pizzaType = "VegetarianPizza";
		}
		else if(pizza instanceof HawaiianPizza)
		{
			pizzaType = "HawaiianPizza";
		}
		else
		{
			pizzaType = "SupremePizza";
		}
		
		switch(pizzaType)
		{
			case "MargheritaPizza":
			{
				((MargheritaPizza)pizza).setCookingPrice(microwaveCookingPrice); //setting cooking price
				if(((MargheritaPizza)pizza).getCookingStrategy() == null) //checking if a cooking strategy is already present
				{
					((MargheritaPizza)pizza).setCookingStrategy(new MicrowaveCookingStrategy());
				}
				double currentMargPizzaPrice = ((MargheritaPizza) pizza).getTotalPrice(); //get original total for this pizza
				((MargheritaPizza) pizza).setTotalPrice(currentMargPizzaPrice + microwaveCookingPrice); //added the cost of microwave cooking to the original total
				return true; //upon completion return true
			}
			case "VegetarianPizza":
			{
				((VegetarianPizza)pizza).setCookingPrice(microwaveCookingPrice);
				if(((VegetarianPizza)pizza).getCookingStrategy() == null)
				{
					((VegetarianPizza)pizza).setCookingStrategy(new MicrowaveCookingStrategy());
				}
				double currentVegPizzaPrice = ((VegetarianPizza) pizza).getTotalPrice(); 
				((VegetarianPizza) pizza).setTotalPrice(currentVegPizzaPrice + microwaveCookingPrice);
				return true;
			}
			case "HawaiianPizza":
			{
				((HawaiianPizza)pizza).setCookingPrice(microwaveCookingPrice);
				if(((HawaiianPizza)pizza).getCookingStrategy() == null)
				{
					((HawaiianPizza)pizza).setCookingStrategy(new MicrowaveCookingStrategy());
				}
				double currentHawaPizzaPrice = ((HawaiianPizza) pizza).getTotalPrice(); 
				((HawaiianPizza) pizza).setTotalPrice(currentHawaPizzaPrice + microwaveCookingPrice);
				return true;

			}
			case "SupremePizza":
			{
				((SupremePizza)pizza).setCookingPrice(microwaveCookingPrice);
				if(((SupremePizza)pizza).getCookingStrategy() == null)
				{
					((SupremePizza)pizza).setCookingStrategy(new MicrowaveCookingStrategy());
				}
				double currentSupPizzaPrice = ((SupremePizza) pizza).getTotalPrice(); 
				((SupremePizza) pizza).setTotalPrice(currentSupPizzaPrice + microwaveCookingPrice);
				return true;
			}
			default:
			{
				break;
			}
		}
		return false; 
	}
}
