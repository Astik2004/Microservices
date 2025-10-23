package com.astik.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.astik.feignclient.PaymentFeignClient;
import com.astik.repository.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	OrderRepository orderRepository;
	
	@Autowired
	PaymentFeignClient feignClient;
	
	public  List<String>getAllPayment()
	{
		String url="http://localhost:8084/payment-service/payment/options";
		RestTemplate restTemp=new RestTemplate();
		ResponseEntity<List>res=restTemp.exchange(url, HttpMethod.GET, null, List.class);
		
		return res.getBody();
	}

	public List<String> getAllPaymentV2() {
		
		return feignClient.getPaymentOptions();
	}

}
