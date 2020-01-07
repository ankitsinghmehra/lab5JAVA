package service;
import dao.CustomerDao;
import dao.CustomerDaoImpl;
import entities.Customer;

public class CustomerServiceImpl implements CustomerService{
	
	private CustomerDao dao;
	public CustomerServiceImpl() {
		dao=new CustomerDaoImpl();
	}

	@Override
	public void addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.addCustomer(customer);
		dao.commitTransaction();
		
	}

	@Override
	public void updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.updateCustomer(customer);
		dao.commitTransaction();
		
	}

	@Override
	public void removeCustomer(Customer customer) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.removeCustomer(customer);
		dao.commitTransaction();
	}

	@Override
	public Customer findCustomerById(int id) {
		// TODO Auto-generated method stub
		Customer customer=dao.getCustomerById(id);
		return customer;
	}
	

}
