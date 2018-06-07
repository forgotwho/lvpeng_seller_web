package com.lvpeng.seller.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.seller.mongo.model.DeliveryUser;

public interface DeliveryUserRepository extends MongoRepository<DeliveryUser, String> {

}
