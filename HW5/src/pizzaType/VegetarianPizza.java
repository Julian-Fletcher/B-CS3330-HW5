package pizzaType;

import java.util.ArrayList;
import java.util.List;

import cookingStrategies.ICookingStrategy;

public class VegetarianPizza extends AbstractPizza {


		
	public VegetarianPizza() 
	{
		super();
		super.toppingList = new ArrayList<Toppings>();
		super.toppingList.add(Toppings.TOMATO);
		super.toppingList.add(Toppings.CHEESE);
		super.toppingList.add(Toppings.BELL_PEPPER);
		super.toppingList.add(Toppings.BLACK_OLIVE);
		super.toppingList.add(Toppings.MUSHROOM);
		super.priceWithoutToppings = 1.50;
	}
	
	public VegetarianPizza(VegetarianPizza pizza)
	{
		super.toppingList = pizza.toppingList;
		super.priceWithoutToppings = pizza.priceWithoutToppings;
		super.totalPrice = pizza.totalPrice;
		super.pizzaOrderID = pizza.pizzaOrderID;
		super.cookingStrategy = pizza.cookingStrategy;
		super.cookingPrice = pizza.cookingPrice;
	}
	
	@Override
	protected double addTopingsToPrice(double priceWithoutToppings)
	{
		double toppingsPrice = 0;
		for(Toppings t : super.toppingList)
		{
			toppingsPrice += t.getToppingPrice();
		}
		super.totalPrice = toppingsPrice + priceWithoutToppings;
		return super.totalPrice;
	}
	
	@Override
	public double updatePizzaPrice()
	{
		//Changed to function for simplicity and reusability
		this.addTopingsToPrice(super.priceWithoutToppings);
		return super.totalPrice;
	}
	
	public double getPriceWithoutToppings() {
		return priceWithoutToppings;
	}

	public void setPriceWithoutToppings(double priceWithoutToppings) {
		super.priceWithoutToppings = priceWithoutToppings;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		super.totalPrice = totalPrice;
	}

	public int getPizzaOrderID() {
		return pizzaOrderID;
	}

	public void setPizzaOrderID(int pizzaOrderID) {
		super.pizzaOrderID = pizzaOrderID;
	}

	public static int getOrderIDCounter() {
		return orderIDCounter;
	}

	public static void setOrderIDCounter(int orderIDCounter) {
		VegetarianPizza.orderIDCounter = orderIDCounter;
	}

	public double getCookingPrice() {
		return cookingPrice;
	}

	public void setCookingPrice(double cookingPrice) {
		super.cookingPrice = cookingPrice;
	}

	public List<Toppings> getToppingList() {
		return toppingList;
	}

	public void setToppingList(List<Toppings> toppingList) {
		super.toppingList = toppingList;
	}

	public ICookingStrategy getCookingStrategy() {
		return cookingStrategy;
	}

	public void setCookingStrategy(ICookingStrategy cookingStrategy) {
		super.cookingStrategy = cookingStrategy;
	}

	@Override
	public String toString() {
		return "VegetarianPizza [toppingList=" + toppingList + ", priceWithoutToppings=" + priceWithoutToppings
				+ ", totalPrice=" + totalPrice + ", pizzaOrderID=" + pizzaOrderID + ", cookingStrategy="
				+ cookingStrategy + ", cookingPrice=" + cookingPrice + "]";
	}
}
