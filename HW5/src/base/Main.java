package base;

import pizzaType.HawaiianPizza;
import pizzaType.MargheritaPizza;
import pizzaType.VegetarianPizza;
import pizzaType.SupremePizza;
import pizzaType.Toppings;


public class Main {

	public static void main(String[] args) {
		System.out.println("Hi");

		MargheritaPizza margPizza = new MargheritaPizza(); 
		HawaiianPizza hawaPizza = new HawaiianPizza();
		VegetarianPizza vegPizza = new VegetarianPizza();
		SupremePizza supPizza = new SupremePizza();
		
		System.out.println(margPizza.toString()); //testing the toString method
		
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
