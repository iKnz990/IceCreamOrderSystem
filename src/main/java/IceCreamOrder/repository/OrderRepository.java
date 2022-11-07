/**
 * @author Alexander Kelly - akelly3
 * CIS175 - Fall 2022
 * Nov 7, 2022
 */
package IceCreamOrder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import IceCreamOrder.beans.Orders;

/**
 * @author 15152
 *
 */
public interface OrderRepository extends JpaRepository<Orders, Long> {

}
