package com.lvpeng.seller.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.seller.mongo.model.Coupon;

public interface CouponRepository extends MongoRepository<Coupon, String> {

}
