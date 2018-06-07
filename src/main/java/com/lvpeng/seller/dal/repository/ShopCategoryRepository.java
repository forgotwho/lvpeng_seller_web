package com.lvpeng.seller.dal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.seller.dal.model.ShopCategory;

public interface ShopCategoryRepository extends MongoRepository<ShopCategory, String> {

}
