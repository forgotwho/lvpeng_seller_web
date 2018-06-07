package com.lvpeng.seller.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.seller.mongo.model.Notice;

public interface NoticeRepository extends MongoRepository<Notice, String> {

}
