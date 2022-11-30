package com.crmapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crmapp.entity.Billing;
import com.crmapp.services.BillingServices;

@Controller
public class BillingController {
	@Autowired
	private BillingServices billServices;
	@RequestMapping("/saveBill")
	public String saveBill(Billing bill,ModelMap model) {
		billServices.saveBill(bill);
		model.addAttribute("bill", bill);
		return "billingResult";
	}
	
	
	

}
