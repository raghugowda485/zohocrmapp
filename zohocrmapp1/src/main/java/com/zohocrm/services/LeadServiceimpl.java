package com.zohocrm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.entities.Lead;
import com.zohocrm.repository.LeadRepository;

@Service
public class LeadServiceimpl implements LeadService {
	
	@Autowired
	private LeadRepository leadRepo;

	@Override
	public void saveOneLead(Lead lead) {
  leadRepo.save(lead);
		
		
	}

	@Override
	public Lead GetOneLeadById(long id) {
         Optional<Lead> findById = leadRepo.findById(id);
         Lead lead = findById.get();
		
		return lead;
	}

	@Override
	public void deleteOneLeadById(long id) {
         leadRepo.deleteById(id);		
	}

	@Override
	public List<Lead> listLeads() {
		List<Lead> leads = leadRepo.findAll();
		return leads;
	}

}
