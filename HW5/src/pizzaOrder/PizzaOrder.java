package pizzaOrder;

import java.util.ArrayList;
import java.util.List;

import cookingStrategies.CookingStyleType;
import cookingStrategies.ICookingStrategy;
import pizzaType.AbstractPizza;
import pizzaType.PizzaType;
import pizzaType.Toppings;

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
				List<Toppings> toppings = order.getToppings();
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
		AbstractPizza newPizza = pizzaFactory.createPizza(pizzaType);	// Might need to make this a specific type
		if(pizzaOrderList.add(newPizza)) {
			return true;
		}
		
		return false;
	}
	
	// Need to find out what pizza it is and then append topping list, possibly update the rest of it too
	public boolean addNewToppingToPizza(int orderID, Toppings topping) {
		AbstractPizza pizza = getPizzaByOrderID(orderID);
		
		return false;
	}
	
	// Same as above but remove
	public boolean removeToppingFromPizza(int orderID, Toppings topping) {
		return false;
	}
	
	
public boolean isThereAnyUncookedPizza() {
    for (AbstractPizza pizza : pizzaOrderList) {
        if (pizza.getCookingStrategy() == null) {
            // If the pizza does not have an assigned cooking strategy
            return true; // There is at least one uncooked pizza
        }
    }
    return false; // All pizzas have assigned cooking strategies
}
	
	 
	public double checkout() throws Exception {
		 return 0;
	}
	 
	// Same as above must switch based on specific pizza type
	public boolean selectCookingStrategyByPizzaOrderID(int orderID, CookingStyleType cookingStrategyType) {
    // Find the pizza associated with the order ID
    AbstractPizza pizza = getPizzaByOrderID(orderID);
    if (pizza == null) {
        // If pizza not found for the given order ID
        return false;
    }

    // Instantiate the cooking strategy based on the provided cookingStrategyType
    ICookingStrategy cookingStrategy;
    switch (cookingStrategyType) {
        case BAKE:
            cookingStrategy = new BakeCookingStrategy();
            break;
        case GRILL:
            cookingStrategy = new GrillCookingStrategy();
            break;
        case FRY:
            cookingStrategy = new FryCookingStrategy();
            break;
        default:
            // Unsupported cooking strategy type
            return false;
    }

    // Set the cooking strategy for the pizza
    pizza.setCookingStrategy(cookingStrategy);

    // Call the cook function for the pizza
    pizza.cook();

    return true;
}
