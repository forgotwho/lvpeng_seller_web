package com.lvpeng.seller.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.seller.mongo.model.SmsCode;

public interface SmsCodeRepository extends MongoRepository<SmsCode, String> {

}
