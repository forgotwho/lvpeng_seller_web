package com.lvpeng.seller.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.seller.mongo.model.ReduceRule;

public interface ReduceRuleRepository extends MongoRepository<ReduceRule, String> {

}
