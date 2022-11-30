package com.crmapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.crmapp.entity.Billing;
import com.crmapp.repository.BillingRepository;

@Component
public class BillingServicesImpl implements BillingServices {
	@Autowired
	private BillingRepository billRepo;

	@Override
	public void saveBill(Billing bill) {
		billRepo.save(bill);
		
	}
	

}
