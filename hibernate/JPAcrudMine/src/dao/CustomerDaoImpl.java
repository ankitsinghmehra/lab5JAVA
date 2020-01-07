package dao;
import javax.persistence.EntityManager;

import entities.Customer;

public class CustomerDaoImpl implements CustomerDao{

	private EntityManager entityManager;
	public CustomerDaoImpl() {
		entityManager=JPAUtil.getEntityManager();
	}
	@Override
	public Customer getCustomerById(int id) {
		// TODO Auto-generated method stub
		Customer customer=entityManager.find(Customer.class, id);
		return customer;
	}

	@Override
	public void addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		entityManager.persist(customer);
	}

	@Override
	public void removeCustomer(Customer customer) {
		// TODO Auto-generated method stub
		entityManager.remove(customer);
		
	}

	@Override
	public void updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		entityManager.merge(customer);
		
	}

	@Override
	public void commitTransaction() {
		// TODO Auto-generated method stub
		entityManager.getTransaction().commit();
	}

	@Override
	public void beginTransaction() {
		// TODO Auto-generated method stub
		entityManager.getTransaction().begin();
	}

}
