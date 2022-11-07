/**
 * @author Alexander Kelly - akelly3
 * CIS175 - Fall 2022
 * Nov 7, 2022
 */
package IceCreamOrder.beans;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;

/**
 * @author 15152
 *
 */
@Data
@Entity
public class Orders {
	@Id
	@GeneratedValue
private long id;
	private String name;
	private String size;
@Autowired
private Flavors flavors;
@Autowired
private Toppings toppings;
@Autowired
private ConeChoice conechoice;

public Orders() {
	super();
	this.name = "";
	this.size = "";
}
public Orders(String name) {
	super();
	this.name = name;
}
public Orders(String name, String size) {
	super();
	this.name = name;
	this.size = size;
}
public Orders(int id, String name, String size) {
	super();
	this.id = id;
	this.name = name;
	this.size = size;
}


}
