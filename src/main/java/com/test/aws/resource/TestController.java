package com.test.aws.resource;

import com.test.aws.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Service
@RequiredArgsConstructor
@RestController
@RequestMapping(path = "/product")
public class TestController {

  private final TestService service;

  @GetMapping("/{id}")
  public String getProduct(@PathVariable int id) {
    return service.getProduct(id);
  }

  @PutMapping("/add/{id}")
  public void addProduct(@PathVariable int id, @RequestBody String product) {
    service.addProduct(id, product);
  }
}
