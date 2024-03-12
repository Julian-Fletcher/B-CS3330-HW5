package pizzaOrder;

import java.util.ArrayList;
import java.util.List;

import cookingStrategies.CookingStyleType;
import cookingStrategies.ICookingStrategy;
import pizzaType.*;

public class PizzaOrder 
{
	private PizzaCookingFactory pizzaFactory;
	private ICookingStrategy cookingStrategy;
	private List<AbstractPizza> pizzaOrderList;
	
	// Construuctor, initializes the orderlist and factory
	public PizzaOrder() {
		pizzaOrderList = new ArrayList<AbstractPizza>();
		pizzaFactory = new PizzaCookingFactory();
	}
	
	// Pull a method made in AbstractPizza to get all toppings
	public void printListOfToppingsByPizzaOrderID(int orderID) {
		// Find the desired orderID, print its topping list
		for(AbstractPizza order : pizzaOrderList) {
			if(order.getPizzaOrderID() == orderID) {
				List<Toppings> toppings = order.getToppingList();
				System.out.println(toppings);
			}
		}
	}
	
	// Prints the pizzas in pizzaOrderList
	public void printPizzaOrderCart(int orderID) {
		System.out.println(pizzaOrderList);	// If java works the way I want it to this will print the full list
	}
	
	// Find the desired pizza and returns it if found
	public AbstractPizza getPizzaByOrderID(int orderID) {
		for(AbstractPizza pizza : pizzaOrderList) {
			if (pizza.getPizzaOrderID() == orderID) {
				return pizza;
			}
		}
		return null;
	}
	
	
	public boolean addPizzaToCart(PizzaType pizzaType) {
		switch(pizzaType) {
			case HAWAIIAN:
				HawaiianPizza hawPizza = (HawaiianPizza) pizzaFactory.createPizza(pizzaType);
				if(pizzaOrderList.add(hawPizza)) {
					return true;
				}
				break;
			case MARGHERITA:
				MargheritaPizza marPizza = (MargheritaPizza) pizzaFactory.createPizza(pizzaType);
				if(pizzaOrderList.add(marPizza)) {
					return true;
				}
				break;
			case SUPREME:
				SupremePizza supPizza = (SupremePizza) pizzaFactory.createPizza(pizzaType);
				if(pizzaOrderList.add(supPizza)) {
					return true;
				}
				break;
			case VEGETARIAN:
				VegetarianPizza vegPizza = (VegetarianPizza) pizzaFactory.createPizza(pizzaType);
				if(pizzaOrderList.add(vegPizza)) {
					return true;
				}
				break;
			default:
				return false;
		}
		return false;
	}
	
	// Need to find out what pizza it is and then append topping list, possibly update the rest of it too
	public boolean addNewToppingToPizza(int orderID, Toppings topping) {
		AbstractPizza pizza = getPizzaByOrderID(orderID);		// Abstract pizza
		// Get the topping list, update it, and set it as the new list
		List<Toppings> toppings = pizza.getToppingList();		
		if(toppings.add(topping)) {
			pizza.setToppingList(toppings);
			return true;
		}
		
		return false;
	}
	
	// Same as above but remove
	public boolean removeToppingFromPizza(int orderID, Toppings topping) {
	AbstractPizza pizza = getPizzaByOrderID(orderID);		// Abstracat pizza
	// Get the topping list, update it, and set it as the new list
		List<Toppings> toppings = pizza.getToppingList();		
		if(toppings.remove(topping)){
			pizza.setToppingList(toppings);
			return true;
		}
		
		return false;
	}
	
	
	public boolean isThereAnyUncookedPizza() {
		/*
		for(AbstractPizza pizza : pizzaOrderList) {
			if(pizza.[METHOD I CANT SEE] == [VALUE FOR NO STRATEGY) {
				return true;
			}
		}
		*/
		return false;
	}
	
	 
	public double checkout() throws Exception {
		 return 0;
	}
	 
	// Same as above must switch based on specific pizza type
	public boolean selectCookingStrategyByPizzaOrderID(int orderID, CookingStyleType cookingStrategyType) {
		AbstractPizza pizza = getPizzaByOrderID(orderID); 
		
		
		return false;
	}
}
