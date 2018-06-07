package com.lvpeng.seller.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.seller.mongo.model.OrderPriceHistory;

public interface OrderPriceHistoryRepository extends MongoRepository<OrderPriceHistory, String> {

}
