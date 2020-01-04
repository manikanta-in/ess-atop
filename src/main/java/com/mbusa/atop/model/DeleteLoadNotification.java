package com.mbusa.atop.model;

import java.util.List;

public class DeleteLoadNotification {
	
	 private String messageType;
	 private float fourKitesLoadId;
	 private String loadNumber;
	 private String proNumber;
	 private String shipper;
	 private List<String> tags = null;
	 private List<String> referenceNumbers = null;
	 private String timestamp;
	 private String timezone;
	 private String timezoneShortName;
	 private float timezoneOffset;
	public String getMessageType() {
		return messageType;
	}
	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}
	public float getFourKitesLoadId() {
		return fourKitesLoadId;
	}
	public void setFourKitesLoadId(float fourKitesLoadId) {
		this.fourKitesLoadId = fourKitesLoadId;
	}
	public String getLoadNumber() {
		return loadNumber;
	}
	public void setLoadNumber(String loadNumber) {
		this.loadNumber = loadNumber;
	}
	public String getProNumber() {
		return proNumber;
	}
	public void setProNumber(String proNumber) {
		this.proNumber = proNumber;
	}
	public String getShipper() {
		return shipper;
	}
	public void setShipper(String shipper) {
		this.shipper = shipper;
	}
	public List<String> getTags() {
		return tags;
	}
	public void setTags(List<String> tags) {
		this.tags = tags;
	}
	public List<String> getReferenceNumbers() {
		return referenceNumbers;
	}
	public void setReferenceNumbers(List<String> referenceNumbers) {
		this.referenceNumbers = referenceNumbers;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public String getTimezone() {
		return timezone;
	}
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
	public String getTimezoneShortName() {
		return timezoneShortName;
	}
	public void setTimezoneShortName(String timezoneShortName) {
		this.timezoneShortName = timezoneShortName;
	}
	public float getTimezoneOffset() {
		return timezoneOffset;
	}
	public void setTimezoneOffset(float timezoneOffset) {
		this.timezoneOffset = timezoneOffset;
	}

}
