package com.crmapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.crmapp.entity.Billing;
import com.crmapp.entity.Contact;
import com.crmapp.entity.Lead;
import com.crmapp.services.ContactServices;
import com.crmapp.services.LeadServices;

@Controller
public class ContactController {
	
	@Autowired
	private LeadServices leadServices;
	
	@Autowired
	private ContactServices contactServices;
	
	@Autowired
	private LeadServices LeadServices;
	@RequestMapping("/convertToContact")
	public String convertToContact(@RequestParam("id") long id,ModelMap model) {
		Lead lead = leadServices.findLeadById(id);
		Contact contact = new Contact();
		contact.setId(lead.getId());
		contact.setFirstName(lead.getFirstName());
		contact.setLastName(lead.getLastName());
		contact.setEmail(lead.getEmail());
		contact.setLeadSource(lead.getLeadSource());
		contact.setMobile(lead.getMobile());
		contactServices.saveContact(contact);
		leadServices.deleteLeadById(id);
		List<Contact> contacts = contactServices.listAllContact();
		model.addAttribute("contact", contacts);
		return "displayContact";
	}
	@RequestMapping("/listallcontact")
	public String listallcontact(ModelMap model) {
		List<Contact> contacts = contactServices.listAllContact();
		model.addAttribute("contact", contacts);
		return "displayContact";
	}
	@RequestMapping("/getContactById")
	public String getContactById(@RequestParam("id") long id,ModelMap model) {
		Contact contact = contactServices.findContactById(id);
		model.addAttribute("contact", contact);
		return "contactResult";
	}
	@RequestMapping("/getBillById")
	public String getBillById(@RequestParam("id") long id,ModelMap model) {
		Contact contact = contactServices.findContactById(id);
		model.addAttribute("contact", contact);
		return "billingInfoPage";
	}
}
