package com.demo.myfirstproject.dao;

import com.demo.myfirstproject.entity.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDao extends CrudRepository<Customer,Integer> {

}
