package com.lvpeng.seller.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.seller.mongo.model.GoodsSkuDetail;

public interface GoodsSkuDetailRepository extends MongoRepository<GoodsSkuDetail, String> {

}
