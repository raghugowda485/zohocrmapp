package com.zohocrm.services;

import java.util.List;

import com.zohocrm.entities.Lead;

public interface LeadService {

	public void saveOneLead(Lead lead);

	public Lead GetOneLeadById(long id);

	public void deleteOneLeadById(long id);

	public List<Lead> listLeads();
	
}
