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
public class Flavors {
private String flavor;

public Flavors() {
	super();
	this.flavor = "";
}
public Flavors(String flavor) {
	super();
	this.flavor = flavor;
}

}
