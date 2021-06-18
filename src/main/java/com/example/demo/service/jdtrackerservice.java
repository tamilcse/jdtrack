package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.jdtrack;


public interface jdtrackerservice {
	
List<jdtrack> getAllData();
	
	void saveData(jdtrack jdt);

	jdtrack getDataById(long id);
	


}
