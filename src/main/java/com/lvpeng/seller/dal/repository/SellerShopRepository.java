package com.lvpeng.seller.dal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.seller.dal.model.SellerShop;

public interface SellerShopRepository extends MongoRepository<SellerShop, String> {

}
