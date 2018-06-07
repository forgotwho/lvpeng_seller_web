package com.lvpeng.seller.dal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.seller.dal.model.ReduceRule;

public interface ReduceRuleRepository extends MongoRepository<ReduceRule, String> {

}
