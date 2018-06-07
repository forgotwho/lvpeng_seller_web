package com.lvpeng.seller.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.seller.mongo.model.Comment;

public interface CommentRepository extends MongoRepository<Comment, String> {

}
