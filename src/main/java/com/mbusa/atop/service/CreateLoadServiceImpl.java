package com.mbusa.atop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mbusa.atop.db.model.Load;
import com.mbusa.atop.mapper.LoadMapper;
import com.mbusa.atop.model.CreateLoadNotification;
import com.mbusa.atop.repo.CreateLoadRepo;



@Service
public class CreateLoadServiceImpl implements CreateLoadService {
	
	@Autowired
	CreateLoadRepo loadRepo;

	@Override
	public void createLoad(CreateLoadNotification loadNotification) {
		Load load = LoadMapper.getLoad(loadNotification);
		loadRepo.save(load);
	}

}
