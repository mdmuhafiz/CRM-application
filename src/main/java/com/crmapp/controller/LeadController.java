package com.crmapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.crmapp.entity.Lead;
import com.crmapp.services.LeadServices;

@Controller
public class LeadController {
	@Autowired
	private LeadServices leadServices;
	
	@RequestMapping("/viewleadpage")
	public String viewLeadPage() {
		
		return "lead_info";
	}
	@RequestMapping("/saveLead")
	public String saveLead(Lead lead,ModelMap model) {
		leadServices.saveLead(lead);
		model.addAttribute("lead", lead);
		return "leadResult";
	}
	@RequestMapping("/listall")
	public String listAll(ModelMap model) {
		List<Lead> lead = leadServices.listAllLeads();
		model.addAttribute("lead", lead);
		return "displayLeads";
	}
	@RequestMapping("/getLeadById")
	public String getLeadById(@RequestParam("id") long id,ModelMap model) {
		Lead lead = leadServices.findLeadById(id);
		model.addAttribute("lead", lead);
		return "leadResult";
		
	}
	

}
