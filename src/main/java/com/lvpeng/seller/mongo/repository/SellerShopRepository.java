package com.lvpeng.seller.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.seller.mongo.model.SellerShop;

public interface SellerShopRepository extends MongoRepository<SellerShop, String> {

}
