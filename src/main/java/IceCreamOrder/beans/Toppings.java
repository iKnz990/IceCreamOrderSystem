/**
 * @author Alexander Kelly - akelly3
 * CIS175 - Fall 2022
 * Nov 7, 2022
 */
package IceCreamOrder.beans;

import javax.persistence.Embeddable;

import lombok.Data;

/**
 * @author 15152
 *
 */
@Data
@Embeddable
public class Toppings {
private String topping1;
private String topping2;
private String topping3;

public Toppings() {
	super();
	this.topping1 = "";
	this.topping2 = "";
	this.topping3 = "";
}
public Toppings(String topping1, String topping2, String topping3) {
	super();
	this.topping1 = topping1;
	this.topping2 = topping2;
	this.topping3 = topping3;
}
}
