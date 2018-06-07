package com.lvpeng.seller.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.seller.mongo.model.Customer;

public interface CustomerRepository extends MongoRepository<Customer, String> {

}
