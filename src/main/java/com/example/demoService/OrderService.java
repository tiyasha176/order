package com.example.demoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoEntity.Order;
import com.example.demoRepository.OrderRepository;


@Service
public class OrderService {
	@Autowired
	private OrderRepository orderRepository;

	//add order

	public Order addOrder(Order order) {
		// TODO Auto-generated method stub
		return orderRepository.save(order);
	}


}
