package pizzaOrder;

import pizzaType.PizzaType;
import pizzaType.AbstractPizza;
import pizzaType.HawaiianPizza;
import pizzaType.MargheritaPizza;
import pizzaType.SupremePizza;
import pizzaType.VegetarianPizza;

public class PizzaCookingFactory {

	
	public AbstractPizza createPizza(PizzaType pizzaType) {
		
		//Initializes new Pizza instance
		AbstractPizza newPizza;
		
		//Default case to allow return
		newPizza = null;
		
		//Decide type and create new Pizza of type
		if(pizzaType == PizzaType.HAWAIIAN) {
			newPizza = new HawaiianPizza();
		}
		if(pizzaType == PizzaType.MARGHERITA) {
			newPizza = new MargheritaPizza();
		}
		if(pizzaType == PizzaType.SUPREME) {
			newPizza = new SupremePizza();
		}
		if(pizzaType == PizzaType.VEGETARIAN) {
			newPizza = new VegetarianPizza();
		}

		//Set PizzaOrderID of newPizza and increment static AbstractPizza counter
		newPizza.setPizzaOrderID(AbstractPizza.getOrderIDCounter());
		AbstractPizza.setOrderIDCounter(AbstractPizza.getOrderIDCounter()+1);

		
		
		
		
		return newPizza;
	}

}

