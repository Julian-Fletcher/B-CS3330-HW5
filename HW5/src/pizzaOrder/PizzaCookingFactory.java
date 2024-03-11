package pizzaOrder;

import pizzaType.PizzaType;
import pizzaType.AbstractPizza;
import pizzaType.HawaiianPizza;
import pizzaType.MargheritaPizza;
import pizzaType.SupremePizza;
import pizzaType.VegetarianPizza;

public class PizzaCookingFactory {

	private int orderIDCounter = 0;
	
	public AbstractPizza createPizza(PizzaType pizzaType) {
		
		
		AbstractPizza newPizza;
		newPizza = null;
		
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
		newPizza.setPizzaOrderID(orderIDCounter);
		orderIDCounter += 1;
		
		
		
		
		return newPizza;
	}

}

