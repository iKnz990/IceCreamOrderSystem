/**
 * @author Alexander Kelly - akelly3
 * CIS175 - Fall 2022
 * Nov 7, 2022
 */
package IceCreamOrder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import IceCreamOrder.beans.Orders;
import IceCreamOrder.repository.OrderRepository;

/**
 * @author 15152
 *
 */
@Controller
public class WebController {
@Autowired
OrderRepository repo;

@GetMapping({"/","/viewPastOrders"})
public String viewPastOrders(Model model) {
	if(repo.findAll().isEmpty()) {
		return addNewOrder(model);
	}
	model.addAttribute("orders", repo.findAll());
	return "results";
}
@GetMapping("/inputOrder")
private String addNewOrder(Model model) {
	Orders o = new Orders();
	model.addAttribute("newOrder",o);
	return "input";
}
@PostMapping("/inputOrder")
public String addNewContact(@ModelAttribute Orders o, Model model) {
	repo.save(o);
	return viewPastOrders(model);
}
@GetMapping("edit/{id}")
public String showUpdateOrder(@PathVariable("id") long id, Model model) {
	Orders o = repo.findById(id).orElse(null);
	model.addAttribute("newOrder", o);
	return "input";
}
@PostMapping("/update/{id}")
public String reviseOrder(Orders o, Model model) {
	repo.save(o);
	return viewPastOrders(model);
}
@GetMapping("/delete/{id}")
public String deleteOrder(@PathVariable("id") long id, Model model) {
	Orders o = repo.findById(id).orElse(null);
	repo.delete(o);
	return viewPastOrders(model);
}




}
