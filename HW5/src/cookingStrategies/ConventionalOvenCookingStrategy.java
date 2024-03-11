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
				((MargheritaPizza)pizza).setCookingPrice(conventionalOvenCookingPrice); //setting cooking price
				if(((MargheritaPizza)pizza).getCookingStrategy() == null) //checking if a cooking strategy is already present
				{
					((MargheritaPizza)pizza).setCookingStrategy(new ConventionalOvenCookingStrategy());
				}
				double currentMargPizzaPrice = ((MargheritaPizza) pizza).getTotalPrice(); //get original total for this pizza
				((MargheritaPizza) pizza).setTotalPrice(currentMargPizzaPrice + conventionalOvenCookingPrice); //added the cost of cooking to the original total
				return true; //upon completion return true
			}
			case "VegetarianPizza":
			{
				((VegetarianPizza)pizza).setCookingPrice(conventionalOvenCookingPrice);
				if(((VegetarianPizza)pizza).getCookingStrategy() == null)
				{
					((VegetarianPizza)pizza).setCookingStrategy(new ConventionalOvenCookingStrategy());
				}
				double currentVegPizzaPrice = ((VegetarianPizza) pizza).getTotalPrice(); 
				((VegetarianPizza) pizza).setTotalPrice(currentVegPizzaPrice + conventionalOvenCookingPrice);
				return true;
			}
			case "HawaiianPizza":
			{
				((HawaiianPizza)pizza).setCookingPrice(conventionalOvenCookingPrice);
				if(((HawaiianPizza)pizza).getCookingStrategy() == null)
				{
					((HawaiianPizza)pizza).setCookingStrategy(new ConventionalOvenCookingStrategy());
				}
				double currentHawaPizzaPrice = ((HawaiianPizza) pizza).getTotalPrice(); 
				((HawaiianPizza) pizza).setTotalPrice(currentHawaPizzaPrice + conventionalOvenCookingPrice);
				return true;

			}
			case "SupremePizza":
			{
				((SupremePizza)pizza).setCookingPrice(conventionalOvenCookingPrice);
				if(((SupremePizza)pizza).getCookingStrategy() == null)
				{
					((SupremePizza)pizza).setCookingStrategy(new ConventionalOvenCookingStrategy());
				}
				double currentSupPizzaPrice = ((SupremePizza) pizza).getTotalPrice(); 
				((SupremePizza) pizza).setTotalPrice(currentSupPizzaPrice + conventionalOvenCookingPrice);
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