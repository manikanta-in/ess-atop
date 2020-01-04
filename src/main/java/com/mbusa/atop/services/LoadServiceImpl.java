package com.mbusa.atop.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mbusa.atop.db.model.Load;
import com.mbusa.atop.repo.LoadRepo;

@Service
public class LoadServiceImpl implements LoadService {
	
	@Autowired
	LoadRepo loadRepo;

	public List<Load> findAll() {
		return loadRepo.findAll();
	}
}
