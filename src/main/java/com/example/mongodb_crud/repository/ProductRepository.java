package com.example.mongodb_crud.repository;

import com.example.mongodb_crud.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface  ProductRepository extends MongoRepository<Product ,String> {


}
