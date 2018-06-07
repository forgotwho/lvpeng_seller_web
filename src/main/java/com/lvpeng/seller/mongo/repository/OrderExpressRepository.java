package com.lvpeng.seller.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.seller.mongo.model.OrderExpress;

public interface OrderExpressRepository extends MongoRepository<OrderExpress, String> {

}
