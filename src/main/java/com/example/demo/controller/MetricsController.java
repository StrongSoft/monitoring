package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MetricsController {

  @GetMapping("/end-point1")
  public String endPoint1(){
    return "Metrics for endPoint1";
  }

  @GetMapping("/end-point2")
  public String endPoint2(){
    return "Metrics for endPoint2";
  }
}
