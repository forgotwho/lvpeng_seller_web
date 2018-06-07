package com.lvpeng.seller.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.seller.mongo.model.Delivery;

public interface DeliveryRepository extends MongoRepository<Delivery, String> {

}
