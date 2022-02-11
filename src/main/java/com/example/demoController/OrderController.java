package com.example.demoController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demoEntity.Order;
import com.example.demoService.OrderService;

@RestController
public class OrderController {
	@Autowired
private OrderService orderService;

@PostMapping("/save order")
public String addorder(@RequestBody Order order) {
	orderService.addOrder(order);
	return "order added";

}
}
