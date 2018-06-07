package com.lvpeng.seller.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.seller.mongo.model.CouponCustomerCount;

public interface CouponCustomerCountRepository extends MongoRepository<CouponCustomerCount, String> {

}
