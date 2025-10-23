package com.astik.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.astik.dto.OrderInformation;
import com.astik.entity.ProductDetails;
import com.astik.service.OrderService;

@RestController
public class OrderController {
	@Autowired
	OrderService orderService;
	
	@PostMapping("/create")
	public String createOrder(@RequestBody OrderInformation products)
	{
		System.out.println("Order creation Request for user "+products.getEmailId());
		return "Order Created,Order Number : "+UUID.randomUUID();
	}
	
	@GetMapping("/info/{orderId}")
	public OrderInformation createOrder(@PathVariable String orderId)
	{
		System.out.println("Order information for Order id "+orderId);
		return new OrderInformation("astik@gmail.com",List.of(new ProductDetails(1,"Iphone",80000),new ProductDetails(2,"Mackbbok",180000),new ProductDetails(3,"S24",80000)),500000);
	}
	
	@GetMapping("/payment/options")
	public List<String>allPayment()
	{
		return orderService.getAllPayment();
	}
	
	@GetMapping("/payment/options/v2")
	public List<String>allPaymentV2()
	{
		return orderService.getAllPaymentV2();
	}

}
