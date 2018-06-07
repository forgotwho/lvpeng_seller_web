package com.lvpeng.seller.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.seller.mongo.model.GoodsSkuInfo;

public interface GoodsSkuInfoRepository extends MongoRepository<GoodsSkuInfo, String> {

}
