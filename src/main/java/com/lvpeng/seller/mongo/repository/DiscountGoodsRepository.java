package com.lvpeng.seller.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.seller.mongo.model.DiscountGoods;

public interface DiscountGoodsRepository extends MongoRepository<DiscountGoods, String> {

}
