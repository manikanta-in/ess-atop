package com.mbusa.atop.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mbusa.atop.model.CreateLoadNotification;
import com.mbusa.atop.model.DeleteLoadNotification;
import com.mbusa.atop.model.UpdateLoadNotification;
import com.mbusa.atop.service.CreateLoadService;

@RestController
@RequestMapping("/api/callback")
public class CallbackApi {
	
	@Autowired
	CreateLoadService loadService;
	
	@PostMapping(value="createLoad")
	public void loadCreateNotification(@RequestBody CreateLoadNotification loadCreate) {
		System.out.println(loadCreate);
	}
	
	
	@PostMapping(value="updateLoad")
	public void updateLoadNotification(@RequestBody UpdateLoadNotification updateLoad) {
		System.out.println(updateLoad);
	}
	
	@PostMapping(value="deleteLoad")
	public void deleteLoadNotification(@RequestBody DeleteLoadNotification deleteLoad) {
		System.out.println(deleteLoad);
	}
	

}
