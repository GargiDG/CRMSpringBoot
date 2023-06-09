package in.gargi.dao;

import org.springframework.data.repository.CrudRepository;

import in.gargi.model.Customer;

public interface ICustomerDAO extends CrudRepository<Customer, Integer> {

}
