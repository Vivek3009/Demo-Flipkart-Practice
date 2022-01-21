/**
 * 
 */
package com.flipkart.business;

import java.util.ArrayList;

import com.flipkart.bean.*;
/**
 * @author vivek
 *
 */
public class CustomerService {
	// The service class implementation all the operation for creating,updating,deleting customers
	
	ArrayList<Customer> customer = new ArrayList<>();
	
	public void createCustomer(int customerId, String customerName, String customerAddress) {
		
		
		// Creating new Customer
		Customer tempCustomer = new Customer();
		tempCustomer.setCustomerId(customerId);
		tempCustomer.setCustomerName(customerName);
		tempCustomer.setCustomerAddress(customerAddress);
		
		// Adding new Customer into customer list
		
		customer.add(tempCustomer);
		
	}
	
	public void updateCustomer(int customerId,String newCusutomerName,String newCustomerAddress) {
		
		// Finding the desire customer with given customer id
		for(Customer cur : customer) {
			
			if(cur.getCustomerId() == customerId) {
				cur.setCustomerName(newCusutomerName);
				cur.setCustomerAddress(newCustomerAddress);
			}
		}
	}

	public void deleteCustomer(int customerId) {
		
		// first will get the index of that specific customer with given customerId and than will remove it form list
		
		int getIndexOfCustomer = 0;
		for(Customer cur : customer) {
			
			if(cur.getCustomerId() == customerId) {
	              break;
			}
			getIndexOfCustomer += 1;
		}
		this.customer.remove(getIndexOfCustomer);
	}
	public void listCustomer() {
		
		this.customer.forEach((cus) -> System.out.println(cus.getCustomerId() + " " + cus.getCustomerName() + " " + cus.getCustomerAddress()));
	}
}
