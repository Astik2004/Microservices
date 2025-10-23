package com.astik.dto;

import java.util.List;

import com.astik.entity.ProductDetails;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderInformation {
	
	private String emailId;
	private List<ProductDetails>productsInfo;
	private double totalAmount;
}
