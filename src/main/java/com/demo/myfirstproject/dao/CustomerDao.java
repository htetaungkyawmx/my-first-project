package com.demo.myfirstproject.dao;

import com.demo.myfirstproject.entity.Customer;
import com.demo.myfirstproject.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDao extends CrudRepository<Product,Integer> {

    static void save(Customer c1) {
    }
}
