package com.lvpeng.seller.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.seller.mongo.model.Member;

public interface MemberRepository extends MongoRepository<Member, String> {

}
