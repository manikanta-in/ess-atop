package com.mbusa.atop.mapper;

import com.mbusa.atop.db.model.Load;
import com.mbusa.atop.model.CallbackNotification;

public class LoadMapper {

	private LoadMapper() {
		
	}
	
	public static Load getLoad(CallbackNotification loadNotification) {
		Load load = new Load();
		load.setLoadNumber(loadNotification.getLoadNumber());
		load.setFourKitesLoadId(loadNotification.getFourKitesLoadId());
		load.setMessageType(loadNotification.getMessageType());
		load.setLoadNumber(loadNotification.getLoadNumber());
		load.setSuccess(loadNotification.isSuccess());
		load.setReferenceNumbers(loadNotification.getReferenceNumbers());
		return load;
	}
	
	
	public static void mapStopArriaval(Load load , CallbackNotification loadNotification) {
		load.setMessageType(loadNotification.getMessageType());
		load.setStopReferenceId(loadNotification.getStopReferenceId());
		load.setStopType(loadNotification.getStopType());
		load.setStopName(loadNotification.getStopName());
		//load.setTimestamp(loadNotification.getTimestam());
	}
	
	public static void mapStopETA(Load load , CallbackNotification loadNotification) {
		load.setMessageType(loadNotification.getMessageType());
		load.setStopReferenceId(loadNotification.getStopReferenceId());
		load.setStopType(loadNotification.getStopType());
		load.setStopName(loadNotification.getStopName());
	}
	
	
	public static void mapLocationUpdate(Load load , CallbackNotification notification) {
		load.setMessageType(notification.getMessageType());
		load.setCity(notification.getCity());
		load.setLocation(notification.getLocation());
		load.setState(notification.getState());
		load.setContry(notification.getContry());
		load.setLatitude(notification.getLatitude());
		load.setLongitude(notification.getLongitude());
		load.setOdometerReading(notification.getOdometerReading());
	}
	
	public static void mapParcelUpdate(Load load , CallbackNotification notification) {
		load.setStatusCode(notification.getStatusCode());
	}
	
	
}
