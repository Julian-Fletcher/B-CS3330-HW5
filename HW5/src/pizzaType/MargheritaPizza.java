package pizzaType;

import java.util.ArrayList;
import java.util.List;

import cookingStrategies.ICookingStrategy;

public class MargheritaPizza extends AbstractPizza {

	protected List<Toppings> toppingList;
	protected double priceWithoutToppings = 2.50;
	protected double totalPrice;
	protected int pizzaOrderID;
	protected static int orderIDCounter;
	protected ICookingStrategy cookingStrategy;
	protected double cookingPrice;
	
	public MargheritaPizza() 
	{
		super();
		this.toppingList = new ArrayList<Toppings>();
		this.toppingList.add(Toppings.TOMATO);
		this.toppingList.add(Toppings.CHEESE);
	}
	
	protected double addTopingsToPrice(double priceWithoutToppings)
	{
		double toppingsPrice = 0;
		for(Toppings t : this.toppingList)
		{
			toppingsPrice += t.getToppingPrice();
		}
		this.totalPrice = toppingsPrice + priceWithoutToppings;
		return this.totalPrice;
	}
	
	public double updatePizzaPrice()
	{
		double toppingsPrice = 0;
		for(Toppings t : this.toppingList)
		{
			toppingsPrice += t.getToppingPrice();
		}
		this.totalPrice = toppingsPrice + priceWithoutToppings;
		return this.totalPrice;
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
		MargheritaPizza.orderIDCounter = orderIDCounter;
	}

	public double getCookingPrice() {
		return cookingPrice;
	}

	public void setCookingPrice(double cookingPrice) {
		this.cookingPrice = cookingPrice;
	}

	public List<Toppings> getToppingList() {
		return toppingList;
	}

	public void setToppingList(List<Toppings> toppingList) {
		this.toppingList = toppingList;
	}

	public ICookingStrategy getCookingStrategy() {
		return cookingStrategy;
	}

	public void setCookingStrategy(ICookingStrategy cookingStrategy) {
		this.cookingStrategy = cookingStrategy;
	}

	@Override
	public String toString() {
		return "MargheritaPizza [toppingList=" + toppingList + ", priceWithoutToppings=" + priceWithoutToppings
				+ ", totalPrice=" + totalPrice + ", pizzaOrderID=" + pizzaOrderID + ", cookingStrategy="
				+ cookingStrategy + ", cookingPrice=" + cookingPrice + "]";
	}
}
