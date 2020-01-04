package com.mbusa.atop.mapper;

import com.mbusa.atop.db.model.Load;
import com.mbusa.atop.model.CreateLoadNotification;

public class LoadMapper {

	private LoadMapper() {
		
	}
	
	public static Load getLoad(CreateLoadNotification loadNotification) {
		Load load = new Load();
		load.setLoadNumber(loadNotification.getLoadNumber());
		return load;
	}
	
}
