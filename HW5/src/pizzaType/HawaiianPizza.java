package pizzaType;

import java.util.List;

public class HawaiianPizza extends AbstractPizza {

	protected List<Toppings> toppingList;
	protected double priceWithoutToppings = 3.00;
	protected double totalPrice;
	protected int pizzaOrderID;
	protected static int orderIDCounter;
	protected ICookingStrategy cookingStrategy;
	protected double cookingPrice;
	
	public HawaiianPizza() 
	{
		super();
	}
	
	protected double addTopingsToPrice(double priceWithoutToppings)
	{
		return 0;
	}
	
	public double updatePizzaPrice()
	{
		return 0;
	}

	public double getPriceWithoutToppings() {
		return priceWithoutToppings;
	}

	public void setPriceWithoutToppings(double priceWithoutToppings) {
		this.priceWithoutToppings = priceWithoutToppings;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public int getPizzaOrderID() {
		return pizzaOrderID;
	}

	public void setPizzaOrderID(int pizzaOrderID) {
		this.pizzaOrderID = pizzaOrderID;
	}

	public static int getOrderIDCounter() {
		return orderIDCounter;
	}

	public static void setOrderIDCounter(int orderIDCounter) {
		HawaiianPizza.orderIDCounter = orderIDCounter;
	}

	public double getCookingPrice() {
		return cookingPrice;
	}

	public void setCookingPrice(double cookingPrice) {
		this.cookingPrice = cookingPrice;
	}
	
	
}
