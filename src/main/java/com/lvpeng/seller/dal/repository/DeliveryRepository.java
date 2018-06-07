package com.lvpeng.seller.dal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.seller.dal.model.Delivery;

public interface DeliveryRepository extends MongoRepository<Delivery, String> {

}
