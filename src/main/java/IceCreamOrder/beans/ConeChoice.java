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
public class ConeChoice {
private String conechoice;

public ConeChoice() {
	super();
	this.conechoice = "";
}
public ConeChoice(String conechoice) {
	super();
	this.conechoice = conechoice;
}

}
