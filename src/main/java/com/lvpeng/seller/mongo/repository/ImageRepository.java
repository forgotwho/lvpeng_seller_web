package com.lvpeng.seller.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.seller.mongo.model.Image;

public interface ImageRepository extends MongoRepository<Image, String> {

}
