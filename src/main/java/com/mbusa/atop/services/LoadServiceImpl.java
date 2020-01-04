package com.mbusa.atop.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mbusa.atop.db.model.Load;
import com.mbusa.atop.repo.LoadRepo;

public class LoadServiceImpl implements LoadService {
	
	@Autowired
	LoadRepo loadRepo;

	public List<Load> findAll() {
		return loadRepo.findAll();
	}
}
