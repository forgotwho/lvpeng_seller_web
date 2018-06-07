package com.lvpeng.seller.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.seller.mongo.model.CategoryRule;

public interface CategoryRuleRepository extends MongoRepository<CategoryRule, String> {

}
