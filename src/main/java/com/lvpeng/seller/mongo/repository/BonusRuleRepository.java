package com.lvpeng.seller.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.seller.mongo.model.BonusRule;

public interface BonusRuleRepository extends MongoRepository<BonusRule, String> {

}
