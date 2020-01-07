package service;

import entities.Customer;

public interface CustomerService {
	public abstract void addCustomer(Customer customer);

	public abstract void updateCustomer(Customer customer);

	public abstract void removeCustomer(Customer customer);

	public abstract Customer findCustomerById(int id);

}
