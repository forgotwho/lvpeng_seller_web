package com.lvpeng.seller.dal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.seller.dal.model.Notice;

public interface NoticeRepository extends MongoRepository<Notice, String> {

}
