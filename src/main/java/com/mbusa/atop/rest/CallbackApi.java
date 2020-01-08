package com.mbusa.atop.rest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.mbusa.atop.model.CallbackNotification;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

public interface CallbackApi {

	
	@ApiOperation(value = "View a list of available employees")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Successfully Created Notification"),
			@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
	})
	@PostMapping(value="notification")
	public void createNotification(@RequestBody CallbackNotification notification);
	
	
	@ApiOperation(value = "View a list of available employees")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Successfully Created Notification"),
			@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
	})
	@PostMapping(value="createLoad")
	public void loadCreateNotification(@RequestBody CallbackNotification loadCreate);
	
	
	
}
