package com.lvpeng.seller.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.seller.mongo.model.GoodsStock;

public interface GoodsStockRepository extends MongoRepository<GoodsStock, String> {

}
