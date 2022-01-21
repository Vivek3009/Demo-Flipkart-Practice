/**
 * 
 */
package com.flipkart.application;

import com.flipkart.business.*;

/**
 * @author vivek
 *
 */
public class CustomerApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CustomerService service = new CustomerService();
		service.createCustomer();
		service.deleteCustomer();
		service.updateCustomer();
		service.listCustomer();

	}

}
