package com.example.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.jdtrack;
import com.example.demo.service.jdtrackerservice;
import com.example.demo.service.jdtrackerserviceimpl;

@RestController
public class Jdtcontroller {
	
	@Autowired
	jdtrackerservice jdtservice;
	
	@GetMapping("/list")
    public List<jdtrack> getAllNotes() {
        return jdtservice.getAllData();
    }

 

	
}
