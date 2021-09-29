package com.test.aws.repository.impl;

import com.test.aws.repository.TestProductRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class TestProductRepositoryImpl implements TestProductRepository {

  List<String> array = new ArrayList<>();

  @Override
  public String getProduct(int id) {
    return array.get(id);
  }

  @Override
  public void addProduct(int id, String product) {
    array.add(id, product);
  }
}
