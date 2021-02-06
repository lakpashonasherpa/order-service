package com.sherpa.aws.cicd.example;


import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Stream;

@Repository
public class OrderDAO {

public List<Order> getOrders(){
 return Stream.of(
         new Order(101, "Mobile", 1, 1200),
         new Order(102, "Laptop", 5, 200000),
         new Order(103, "Desktop", 10, 50000)
                 .collect(Collector.toList())
 );


 }




}
