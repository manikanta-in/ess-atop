package com.mbusa.atop.model;

import java.util.List;

public class UpdateLoadNotification {

	private String encryptedAccessToken;
	private List<String> errors = null;
	private String shipper;
	private String loadNumber;
	private float proNumber;
	private String timestamp;
	private String scac;
	private List<String> tags = null;
	private String messageType;
	private List<String> updatedFields = null;
	private boolean isSuccess;
	private String timezoneShortName;
	private float fourKitesLoadId;
	private String timezone;
	private List<String> referenceNumbers = null;
	private float timezoneOffset;
	
	public String getEncryptedAccessToken() {
		return encryptedAccessToken;
	}
	public void setEncryptedAccessToken(String encryptedAccessToken) {
		this.encryptedAccessToken = encryptedAccessToken;
	}
	public List<String> getErrors() {
		return errors;
	}
	public void setErrors(List<String> errors) {
		this.errors = errors;
	}
	public String getShipper() {
		return shipper;
	}
	public void setShipper(String shipper) {
		this.shipper = shipper;
	}
	public String getLoadNumber() {
		return loadNumber;
	}
	public void setLoadNumber(String loadNumber) {
		this.loadNumber = loadNumber;
	}
	public float getProNumber() {
		return proNumber;
	}
	public void setProNumber(float proNumber) {
		this.proNumber = proNumber;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public String getScac() {
		return scac;
	}
	public void setScac(String scac) {
		this.scac = scac;
	}
	public List<String> getTags() {
		return tags;
	}
	public void setTags(List<String> tags) {
		this.tags = tags;
	}
	public String getMessageType() {
		return messageType;
	}
	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}
	public List<String> getUpdatedFields() {
		return updatedFields;
	}
	public void setUpdatedFields(List<String> updatedFields) {
		this.updatedFields = updatedFields;
	}
	public boolean isSuccess() {
		return isSuccess;
	}
	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public String getTimezoneShortName() {
		return timezoneShortName;
	}
	public void setTimezoneShortName(String timezoneShortName) {
		this.timezoneShortName = timezoneShortName;
	}
	public float getFourKitesLoadId() {
		return fourKitesLoadId;
	}
	public void setFourKitesLoadId(float fourKitesLoadId) {
		this.fourKitesLoadId = fourKitesLoadId;
	}
	public String getTimezone() {
		return timezone;
	}
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
	public List<String> getReferenceNumbers() {
		return referenceNumbers;
	}
	public void setReferenceNumbers(List<String> referenceNumbers) {
		this.referenceNumbers = referenceNumbers;
	}
	public float getTimezoneOffset() {
		return timezoneOffset;
	}
	public void setTimezoneOffset(float timezoneOffset) {
		this.timezoneOffset = timezoneOffset;
	}

}
