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
				((MargheritaPizza)pizza).setCookingPrice(brickOvenCookingPrice); //setting cooking price
				if(((MargheritaPizza)pizza).getCookingStrategy() == null) //checking if a cooking strategy is already present
				{
					((MargheritaPizza)pizza).setCookingStrategy(new BrickOvenCookingStrategy());
				}
				double currentMargPizzaPrice = ((MargheritaPizza) pizza).getTotalPrice(); //get original total for this pizza
				((MargheritaPizza) pizza).setTotalPrice(currentMargPizzaPrice + brickOvenCookingPrice); //added the cost of cooking to the original total
				return true; //upon completion return true
			}
			case "VegetarianPizza":
			{
				((VegetarianPizza)pizza).setCookingPrice(brickOvenCookingPrice);
				if(((VegetarianPizza)pizza).getCookingStrategy() == null)
				{
					((VegetarianPizza)pizza).setCookingStrategy(new BrickOvenCookingStrategy());
				}
				double currentVegPizzaPrice = ((VegetarianPizza) pizza).getTotalPrice(); 
				((VegetarianPizza) pizza).setTotalPrice(currentVegPizzaPrice + brickOvenCookingPrice);
				return true;
			}
			case "HawaiianPizza":
			{
				((HawaiianPizza)pizza).setCookingPrice(brickOvenCookingPrice);
				if(((HawaiianPizza)pizza).getCookingStrategy() == null)
				{
					((HawaiianPizza)pizza).setCookingStrategy(new BrickOvenCookingStrategy());
				}
				double currentHawaPizzaPrice = ((HawaiianPizza) pizza).getTotalPrice(); 
				((HawaiianPizza) pizza).setTotalPrice(currentHawaPizzaPrice + brickOvenCookingPrice);
				return true;

			}
			case "SupremePizza":
			{
				((SupremePizza)pizza).setCookingPrice(brickOvenCookingPrice);
				if(((SupremePizza)pizza).getCookingStrategy() == null)
				{
					((SupremePizza)pizza).setCookingStrategy(new BrickOvenCookingStrategy());
				}
				double currentSupPizzaPrice = ((SupremePizza) pizza).getTotalPrice(); 
				((SupremePizza) pizza).setTotalPrice(currentSupPizzaPrice + brickOvenCookingPrice);
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
