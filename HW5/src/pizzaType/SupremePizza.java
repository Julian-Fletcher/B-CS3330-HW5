package pizzaType;

public class SupremePizza extends AbstractPizza {

	// protected List<Toppings> toppingList;
	protected double priceWithoutToppings = 3.50;
	protected double totalPrice;
	protected int pizzaOrderID;
	protected static int orderIDCounter;
	// protected ICookingStrategy cookingStrategy;
	protected double cookingPrice;
	
	public SupremePizza() 
	{
		// TODO Auto-generated constructor stub
	}
	
	protected double addTopingsToPrice(double priceWithoutToppings)
	{
		return 0;
	}
	
	public double updatePizzaPrice()
	{
		return 0;
	}
}
