package com.mbusa.atop.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mbusa.atop.db.model.Load;
import com.mbusa.atop.services.LoadService;



@RestController
@RequestMapping("/api/loads")
public class LoadApi {
	
	@Autowired
	LoadService loadService;
	
	@GetMapping(value="findAll")
	public List<Load> findAll() {
		return loadService.findAll();
		
	}

}
