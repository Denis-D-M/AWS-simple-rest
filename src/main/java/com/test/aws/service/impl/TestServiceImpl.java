package com.test.aws.service.impl;

import com.test.aws.repository.TestProductRepository;
import com.test.aws.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TestServiceImpl implements TestService {

  private final TestProductRepository repository;

  @Override
  public String getProduct(int id) {
    return repository.getProduct(id);
  }

  @Override
  public void addProduct(int id, String product) {
    repository.addProduct(id, product);
  }
}
