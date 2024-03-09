package cookingStrategies;

import pizzaType.AbstractPizza;

public interface ICookingStrategy 
{
	public boolean cook(AbstractPizza pizza);
}
