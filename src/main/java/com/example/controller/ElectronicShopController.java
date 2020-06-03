package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Electronic;
import com.example.service.ElectronicShopService;

@RestController
public class ElectronicShopController {

	private final ElectronicShopService electronicShopService;

	@Autowired
	public ElectronicShopController(ElectronicShopService electronicShopService) {
		this.electronicShopService = electronicShopService;
	}

	@RequestMapping(value = "/getDiscountInsights", method = RequestMethod.GET, produces = "application/json")
	public Electronic getElectronicDetail(@RequestParam(required = true) String type,
			@RequestParam(required = true) int price) {
		Electronic electronic = new Electronic();
		electronic.setType(type);
		electronic.setPrice(price);
		electronicShopService.getElectronicDiscount(electronic);
		return electronic;
	}

}