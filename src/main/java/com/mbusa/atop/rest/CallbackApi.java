package com.mbusa.atop.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mbusa.atop.model.CallbackNotification;
import com.mbusa.atop.services.NotificationService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/api/callback")
public class CallbackApi {

	@Autowired
	NotificationService notificationService;


	@PostMapping(value="notification")
	@ApiOperation(value = "View a list of available employees")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Successfully retrieved list"),
			@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
	})
	public void createNotification(@RequestBody CallbackNotification notification) {
		notificationService.createNotification(notification);
		System.out.println(notification);
	}

	@PostMapping(value="createLoad")
	public void loadCreateNotification(@RequestBody CallbackNotification loadCreate) {
		notificationService.createLoad(loadCreate);
		System.out.println(loadCreate);
	}


	@PostMapping(value="updateLoad")
	public void updateLoadNotification(@RequestBody CallbackNotification updateLoad) {
		System.out.println(updateLoad);
	}

	@PostMapping(value="deleteLoad")
	public void deleteLoadNotification(@RequestBody CallbackNotification deleteLoad) {
		System.out.println(deleteLoad);
	}


	@PostMapping(value="stopETA")
	public void stopETA(@RequestBody CallbackNotification notification) {
		notificationService.stopETA(notification);
	}

	@PostMapping(value="locationUpdate")
	public void locationUpdate(@RequestBody CallbackNotification notification) {
		notificationService.locationUpdate(notification);
	}


	@PostMapping(value="stopArrival")
	public void stopArrival(@RequestBody CallbackNotification notification) {
		notificationService.stopArrival(notification);
	}


	@PostMapping(value="parcelUpdate")
	public void parcelUpdate(@RequestBody CallbackNotification notification) {
		notificationService.parcelUpdate(notification);
	}


}
