package com.zohocrm.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zohocrm.entities.Contact;
import com.zohocrm.entities.Lead;
import com.zohocrm.services.ContactService;


@Controller
public class ContatctController {
	
	@Autowired
	private ContactService contactService;
	
	
	@RequestMapping("/listallcontacts")
	public String listAllLeads(ModelMap model) {
		
	List<Contact> contacts=contactService.listContacts();
	model.addAttribute("contacts",contacts);
	return"search_contact_result" ;
}
}



