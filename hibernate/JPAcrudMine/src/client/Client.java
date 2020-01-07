package client;

import entities.Customer;
import service.CustomerService;
import service.CustomerServiceImpl;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerService service=new CustomerServiceImpl();
		Customer customer=new Customer();
		customer.setCustomerId(102);
		customer.setName("rohan");
		service.addCustomer(customer);
		
//		//at this breakpoint, we have added one record to table
		customer = service.findCustomerById(101);
		System.out.print("ID:"+customer.getCustomerId());
		System.out.println(" Name:"+customer.getName());
		
		customer.setName("deepesh");
		service.updateCustomer(customer);
		
		//at this breakpoint, we have updated record added in first section
		customer = service.findCustomerById(101);
		System.out.print("ID:"+customer.getCustomerId());
		System.out.println(" Name:"+customer.getName());
		
		//at this breakpoint, record is removed from table
		Customer c=new Customer();
		c.setCustomerId(100);
		service.removeCustomer(c);
		System.out.println("End of program...");
		
		

	}

}
