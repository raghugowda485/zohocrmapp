package com.zohocrm.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.entities.Contact;
import com.zohocrm.entities.Lead;
import com.zohocrm.services.ContactService;
import com.zohocrm.services.LeadService;
import com.zohocrm.util.EmailService;

@Controller
public class LeadController {
	
	@Autowired
	private EmailService emailservice;
	
	@Autowired
	private LeadService leadService; 
	
	@Autowired
	private ContactService contactService;
	
	
	
	@RequestMapping("/")
	public String viewCreateLeadPage() {
		return "create_lead";
		
	}
	
	@RequestMapping("/saveLead")
	public String saveLead(@ModelAttribute("lead") Lead lead ,ModelMap model) {
		leadService.saveOneLead(lead);
		emailservice.sendMail("gopalnaik161@gmail.com", "welcome", "test email");
		model.addAttribute("lead",lead);
		return "lead_info";
		
	}
	
	@RequestMapping("/convertLead")
	public String convertLead(@RequestParam("id")long id, ModelMap model) {
		Lead lead = leadService.GetOneLeadById(id);
		Contact contact= new Contact();
        contact.setFirstName(lead.getFirstName());
        contact.setLastName(lead.getLastName());
        contact.setEmail(lead.getEmail());
        contact.setMobile(lead.getMobile());
        
        contactService.saveContact(contact);
        
        leadService.deleteOneLeadById(id);
		
        List<Contact> contacts=contactService.listContacts();
    	model.addAttribute("contacts",contacts);
    	return"search_contact_result" ;
	}
	@RequestMapping("/listall")
	public String listAllLeads(ModelMap model) {
		
	List<Lead>leads=leadService.listLeads();
	model.addAttribute("leads",leads);
	return"search_lead_result" ;
		
	}
	@RequestMapping("/leadInfo")
     public String leadInfo(@RequestParam("id")long id, ModelMap model) {
		Lead lead = leadService.GetOneLeadById(id);
        model.addAttribute("lead",lead);
        return "lead_info";
    	 
     }
	

}
