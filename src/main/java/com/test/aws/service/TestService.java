package com.test.aws.service;

import org.springframework.stereotype.Service;

@Service
public interface TestService {

  String getProduct(int id);

  void addProduct(int id, String product);

}
