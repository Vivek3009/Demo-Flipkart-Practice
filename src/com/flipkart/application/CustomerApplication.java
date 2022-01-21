/**
 * 
 */
package com.flipkart.application;

import java.util.Scanner;

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
		
		
		// Displaying the multiple option to user
		System.out.println("For Intertion : 1");
		System.out.println("For Deletion : 2");
		System.out.println("For Updation : 3");
		System.out.println("For Listing All Customer : 4");
		System.out.println("For Stoping  : 5");
		
		
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int takeUserChoice = sc.nextInt();
			boolean shouldComeOut = false;
			
			switch(takeUserChoice) {
			
			case 1 : service.createCustomer(101, "Vivek", "Jaipur");
			         break;
			case 2 : service.deleteCustomer(101);
			         break;
			case 3 : service.updateCustomer(101,"Ram Kishore", "Amber");
			         break;
			case 4 : service.listCustomer();
			         break;
			case 5 : shouldComeOut = true;
			}
		
			if(shouldComeOut)break;
			
		}
	}

}
