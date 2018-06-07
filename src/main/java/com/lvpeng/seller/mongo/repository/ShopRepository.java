package com.lvpeng.seller.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.seller.mongo.model.Shop;

public interface ShopRepository extends MongoRepository<Shop, String> {

}
