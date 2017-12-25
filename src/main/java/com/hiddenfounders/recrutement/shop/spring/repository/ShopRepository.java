package com.hiddenfounders.recrutement.shop.spring.repository;

import com.hiddenfounders.recrutement.shop.spring.model.Shop;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopRepository extends MongoRepository<Shop, String> {
    //
}
