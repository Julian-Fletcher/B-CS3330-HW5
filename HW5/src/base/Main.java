package base;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import cookingStrategies.BrickOvenCookingStrategy;
import cookingStrategies.ConventionalOvenCookingStrategy;
import cookingStrategies.MicrowaveCookingStrategy;
import pizzaType.HawaiianPizza;
import pizzaType.MargheritaPizza;
import pizzaType.PizzaType;
import pizzaType.VegetarianPizza;
import pizzaType.SupremePizza;
import pizzaType.Toppings;
import pizzaOrder.PizzaCookingFactory;
import pizzaOrder.PizzaOrder;
import pizzaType.AbstractPizza;

public class Main {

	public static void main(String[] args)
	{
		PizzaCookingFactory c = new PizzaCookingFactory();
		AbstractPizza margPizza = c.createPizza(PizzaType.MARGHERITA);
		//MargheritaPizza margPizza = new MargheritaPizza(); 
		AbstractPizza hawaPizza = c.createPizza(PizzaType.HAWAIIAN);
		//HawaiianPizza hawaPizza = new HawaiianPizza();
		AbstractPizza vegPizza = c.createPizza(PizzaType.VEGETARIAN);
		//VegetarianPizza vegPizza = new VegetarianPizza();
		SupremePizza supPizza = new SupremePizza();
		
		System.out.println(margPizza.toString()); //toString before cooking in microwave
		MicrowaveCookingStrategy microwave = new MicrowaveCookingStrategy();
		microwave.cook(margPizza);
		System.out.println(margPizza.toString()); //toString after cooking in microwave
		System.out.println();
		
		System.out.println(hawaPizza.toString()); //toString before cooking in brickOven
		BrickOvenCookingStrategy brickOven = new BrickOvenCookingStrategy();
		brickOven.cook(hawaPizza);
		System.out.println(hawaPizza.toString()); //toString after cooking in brickOven
		System.out.println();
		
		System.out.println(vegPizza.toString()); //toString before cooking in conventionalOven
		ConventionalOvenCookingStrategy conventionalOven = new ConventionalOvenCookingStrategy();
		conventionalOven.cook(vegPizza);
		System.out.println(vegPizza.toString()); //toString after cooking in conventionalOven
		System.out.println();
		System.out.println(hawaPizza.toString());
		
		// Testing Pizza Order
		PizzaOrder orderPizza = new PizzaOrder();
		// Modify marghertia
		List<Toppings> customTopping1 = new ArrayList<>(Arrays.asList(Toppings.ITALIAN_SAUSAGE, Toppings.CANADIAN_BACON));
		// Modify hawaiian
		List<Toppings> remove1 = new ArrayList<>(Arrays.asList(Toppings.PINEAPPLE));
		// Modiy veggie
		List<Toppings> customTopping2 = new ArrayList<>(Arrays.asList(Toppings.ITALIAN_SAUSAGE, Toppings.PEPPERONI, Toppings.CANADIAN_BACON));
	
		
		boolean add1 = orderPizza.addPizzaToCart(PizzaType.HAWAIIAN);
		boolean add2 = orderPizza.addPizzaToCart(PizzaType.MARGHERITA);
		boolean add3 = orderPizza.addPizzaToCart(PizzaType.VEGETARIAN);
		if(!add1 || !add2 || !add3) {
			System.out.println("No add!");
		}
		// How do you access order id
		

		System.out.println("Pizza ID: " + margPizza.getPizzaOrderID());
		
		
		
		//SupremePizza supPizza2 = new SupremePizza(supPizza); 
		//System.out.println(supPizza2.toString());//testing copy constructor
		
		/*
		System.out.println("MargPizza without toppings cost: " + margPizza.getPriceWithoutToppings());
		for(Toppings t : margPizza.getToppingList()) //testing if the default toppings for MargheritaPizza are present
		{
			System.out.println("MargPizza Toppings and Price: " + t + " " + t.getToppingPrice()); //testing toppings prices
		}
		System.out.println();
		
		System.out.println("HawaPizza without toppings cost: " + hawaPizza.getPriceWithoutToppings());
		for(Toppings t : hawaPizza.getToppingList()) //testing if the default toppings for HawaiianPizza are present
		{
			System.out.println("HawaPizza Toppings and Price: " + t + " " + t.getToppingPrice()); //testing toppings prices
		}
		System.out.println();
		
		System.out.println("VegPizza without toppings cost: " + vegPizza.getPriceWithoutToppings());
		for(Toppings t : vegPizza.getToppingList()) //testing if the default toppings for VegetarianPizza are present
		{
			System.out.println("VegPizza Toppings and Price: " + t + " " + t.getToppingPrice()); //testing toppings prices
		}
		System.out.println();
		
		System.out.println("SupPizza without toppings cost: " + supPizza.getPriceWithoutToppings());
		for(Toppings t : supPizza.getToppingList()) //testing if the default toppings for MargheritaPizza are present
		{
			System.out.println("SupPizza Toppings and Price: " + t + " " + t.getToppingPrice()); //testing toppings prices
		}
		System.out.println();
		*/
	}
}
