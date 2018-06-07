package com.lvpeng.seller.dal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.seller.dal.model.DeliveryUser;

public interface DeliveryUserRepository extends MongoRepository<DeliveryUser, String> {

}
