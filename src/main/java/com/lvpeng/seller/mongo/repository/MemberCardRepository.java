package com.lvpeng.seller.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.seller.mongo.model.MemberCard;

public interface MemberCardRepository extends MongoRepository<MemberCard, String> {

}
