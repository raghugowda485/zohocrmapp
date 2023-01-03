package com.zohocrm.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zohocrm.entities.Billing;
import com.zohocrm.services.BillingService;

@Controller
public class BillingController {
	
	@Autowired
	private BillingService billingservice;
	
	@RequestMapping("/showGenerateBillPage")
	public String showGenerateBillPage() {
		return "generate_bill";
		
	}
	
	@RequestMapping("/generateBill")
	public String generateBill(@ModelAttribute("bill") Billing bill, ModelMap model ) {
	
		billingservice.saveBill(bill);
		model.addAttribute(bill);
		return "search_billing_result";
		
	}

}
