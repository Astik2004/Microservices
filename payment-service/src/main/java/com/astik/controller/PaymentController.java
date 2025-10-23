package com.astik.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.astik.dto.NetBankInfo;

@RestController
public class PaymentController {
	
	@GetMapping("/options")
	public List<String>paymentOptions()
	{
		return List.of("UPI","NetBanking","Debit","Credit");
	}
	@PostMapping("/netbanking")
	public String doPayemnt(@RequestBody NetBankInfo info)
	{
		return "Payment Succes";
	}
}
