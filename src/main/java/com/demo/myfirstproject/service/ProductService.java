package com.demo.myfirstproject.service;

import com.demo.myfirstproject.dao.CustomerDao;
import com.demo.myfirstproject.entity.Customer;
import com.demo.myfirstproject.entity.Product;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductService {

    private final CustomerDao customerDao;

    public ProductService(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }
    @Transactional
    public void createDatabase(){
        Customer c1=new Customer("Fruits");
        Customer c2=new Customer("Meats");
        Customer c3=new Customer("Drinks");

        Product p1=new Product("Apple",20,20000);
        Product p2=new Product("Orange",15,15000);

        Product p3=new Product("Fish",10,10000);
        Product p4=new Product("Pig",5,5000);

        Product p5=new Product("Jack Daniel", 7,70000);
        Product p6=new Product("Sir-Edward", 5, 50000);

        c1.addProducts(p1);
        c1.addProducts(p2);
        c2.addProducts(p3);
        c2.addProducts(p4);
        c3.addProducts(p5);
        c3.addProducts(p6);

        CustomerDao.save(c1);
        CustomerDao.save(c2);
        CustomerDao.save(c3);
    }
}
