package com.crmapp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.crmapp.entity.Lead;
import com.crmapp.repository.BillingRepository;
import com.crmapp.repository.ContactRepository;
import com.crmapp.repository.LeadRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class BillingRepositoryTest {
	@Autowired
	private BillingRepository billRepo;
	@Test
	public void saveOneData() {
		
	}

}
