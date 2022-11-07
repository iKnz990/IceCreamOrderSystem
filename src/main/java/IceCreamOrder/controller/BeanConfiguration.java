/**
 * @author Alexander Kelly - akelly3
 * CIS175 - Fall 2022
 * Nov 7, 2022
 */
package IceCreamOrder.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import IceCreamOrder.beans.ConeChoice;
import IceCreamOrder.beans.Flavors;
import IceCreamOrder.beans.Orders;
import IceCreamOrder.beans.Toppings;

/**
 * @author 15152
 *
 */
@Configuration
public class BeanConfiguration {

	@Bean
	public Orders order() {
		Orders bean = new Orders("Alex's Order", "Large");
		return bean;
	}
	@Bean
	public ConeChoice conechoice() {
		ConeChoice bean = new ConeChoice("Waffle");
		return bean;
	}
	@Bean
	public Flavors flavors() {
		Flavors bean = new Flavors("Chocolate");
		return bean;
	}
	@Bean
	public Toppings toppings() {
		Toppings bean = new Toppings("Sprinkles","Marshmellows","Chocolate Chips");
		return bean;
	}
	
	
}
