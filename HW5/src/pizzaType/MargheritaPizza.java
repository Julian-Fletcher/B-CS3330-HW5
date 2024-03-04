package pizzaType;

public class MargheritaPizza extends AbstractPizza {

	// protected List<Toppings> toppingList;
	protected double priceWithoutToppings = 2.50;
	protected double totalPrice;
	protected int pizzaOrderID;
	protected static int orderIDCounter;
	// protected ICookingStrategy cookingStrategy;
	protected double cookingPrice;
	
	public MargheritaPizza() 
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
