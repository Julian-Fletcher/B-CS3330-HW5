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
		
		for(Toppings t : margPizza.getToppingList()) //testing if the default toppings for MargheritaPizza are present
		{
			System.out.println("MargPizza Toppings: " + t);
		}
		System.out.println();
		
		for(Toppings t : hawaPizza.getToppingList()) //testing if the default toppings for HawaiianPizza are present
		{
			System.out.println("HawaPizza Toppings: " + t);
		}
		System.out.println();
		
		for(Toppings t : vegPizza.getToppingList()) //testing if the default toppings for VegetarianPizza are present
		{
			System.out.println("VegPizza Toppings: " + t);
		}
		System.out.println();
		
		for(Toppings t : supPizza.getToppingList()) //testing if the default toppings for SupremePizza are present
		{
			System.out.println("SupPizza Toppings: " + t);
		}
		System.out.println();
	}
}
