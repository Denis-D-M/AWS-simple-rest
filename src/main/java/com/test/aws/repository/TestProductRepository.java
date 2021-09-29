package com.test.aws.repository;

import org.springframework.stereotype.Repository;

@Repository
public interface TestProductRepository {

  String getProduct(int id);

  void addProduct(int id, String product);
}
