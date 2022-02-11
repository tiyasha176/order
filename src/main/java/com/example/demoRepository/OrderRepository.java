package com.example.demoRepository;

import org.springframework.data.repository.CrudRepository;

import com.example.demoEntity.Order;



public interface OrderRepository  extends CrudRepository<Order, Integer>{

}
