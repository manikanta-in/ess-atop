package com.mbusa.atop.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mbusa.atop.db.model.Load;
import com.mbusa.atop.mapper.LoadMapper;
import com.mbusa.atop.model.CallbackNotification;
import com.mbusa.atop.repo.LoadRepo;

import om.mbusa.atop.enums.MessageType;



@Service
public class NotificationServiceImpl implements NotificationService {

	@Autowired
	LoadRepo loadRepo;

	@Override
	public void createLoad(CallbackNotification loadNotification) {
		Load load = LoadMapper.getLoad(loadNotification);
		loadRepo.save(load);
	}

	@Override
	public void createNotification(CallbackNotification notification) {
		if(MessageType.STOP_ARRIVAL.name().equals(notification.getMessageType())) {
			stopArrival(notification);
		}
		else if(MessageType.LOCATION_UPDATE.name().equals(notification.getMessageType())) {
			locationUpdate(notification);
		}
		else if(MessageType.PARCEL_UPDATE.name().equals(notification.getMessageType())) {
			parcelUpdate(notification);;
		}
		else if(MessageType.STOP_ETA_UPDATED.name().equals(notification.getMessageType())) {
			stopETA(notification);
		}

	}



	@Override
	public void stopETA(CallbackNotification notification) {
		Load load = getLoad(notification);
		LoadMapper.mapStopETA(load, notification);
		loadRepo.save(load);

	}

	@Override
	public void locationUpdate(CallbackNotification notification) {
		Load load =getLoad(notification);
		LoadMapper.mapLocationUpdate(load, notification);
		loadRepo.save(load);

	}

	@Override
	public void stopArrival(CallbackNotification notification) {
		Load load =getLoad(notification);
		LoadMapper.mapStopArriaval(load, notification);
		loadRepo.save(load);

	}

	@Override
	public void parcelUpdate(CallbackNotification notification) {
		Load load =getLoad(notification);
		LoadMapper.mapParcelUpdate(load, notification);
		loadRepo.save(load);

	}

	private Load getLoad(CallbackNotification notification) {
		Long fourKitesId = notification.getFourKitesLoadId();
		return loadRepo.findByfourKitesLoadIdOrderById(fourKitesId);
	}


}
