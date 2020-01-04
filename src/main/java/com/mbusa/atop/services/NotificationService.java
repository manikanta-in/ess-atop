package com.mbusa.atop.services;

import com.mbusa.atop.model.CallbackNotification;

public interface NotificationService {
	
	
	
	/** 
	 * @param notification
	 */
	public void createNotification(CallbackNotification notification);
	
	/** 
	 * @param notification
	 */
	public void createLoad(CallbackNotification notification);
	
	
	/**
	 * 
	 * @param notification
	 */
	public void stopETA(CallbackNotification notification);
	
	/**
	 * 
	 * @param notification
	 */
	public void locationUpdate(CallbackNotification notification);
	
	/**
	 * 
	 * @param notification
	 */
	public void stopArrival(CallbackNotification notification);
	
	/**
	 * 
	 * @param notification
	 */
	public void parcelUpdate(CallbackNotification notification);

}
