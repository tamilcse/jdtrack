package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.jdtrack;
import com.example.demo.repos.Jdtrackerrepository;

@Service
public class jdtrackerserviceimpl implements jdtrackerservice  {
    
	@Autowired
	Jdtrackerrepository jdtrackerrepository;
	
	@Override
	public List<jdtrack> getAllData() {
		// TODO Auto-generated method stub
	
		return jdtrackerrepository.findAll();
	}

	@Override
	public void saveData(jdtrack jdt) {
		this.jdtrackerrepository.save(jdt);
		
	}

	@Override
	public jdtrack getDataById(long id) {
		Optional <jdtrack> optional = jdtrackerrepository.findById(id);
		jdtrack jdt=null;
		if (optional.isPresent()) {
			jdt=optional.get();
		}
		else {
			throw new RuntimeException("record not found for id ::"+ id);
		}		
		return jdt;
	}
	
	

}
