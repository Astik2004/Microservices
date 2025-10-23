package com.astik.feignclient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("payment-service")
public interface PaymentFeignClient {
	@GetMapping("/payment/options")
	List<String>getPaymentOptions();
}
