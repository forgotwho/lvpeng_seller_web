package com.lvpeng.seller.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.seller.mongo.model.DiscountCategory;

public interface DiscountCategoryRepository extends MongoRepository<DiscountCategory, String> {

}
