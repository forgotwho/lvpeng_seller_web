package com.lvpeng.seller.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.seller.mongo.model.ShopChargeLimit;

public interface ShopChargeLimitRepository extends MongoRepository<ShopChargeLimit, String> {

}
