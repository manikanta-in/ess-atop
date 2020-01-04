package com.mbusa.atop.model;

import java.util.List;

public class CreateLoadNotification {

	private String messageType;
	private boolean isSuccess;
	private float fourKitesLoadId;
	private String loadNumber;
	private String proNumber;
	private String scac;
	private String shipper;
	private List<String> tags;
	private String consignmentEncryptedAccessToken;
	private List <String> referenceNumbers = null;
	private String encryptedAccessToken;
	private String timestamp;
	private String timezone;
	private String timezoneShortName;
	private float timezoneOffset;
	private List<String> errors;
	
	public String getMessageType() {
		return messageType;
	}
	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}
	public boolean isSuccess() {
		return isSuccess;
	}
	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
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
	public String getScac() {
		return scac;
	}
	public void setScac(String scac) {
		this.scac = scac;
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
	public String getConsignmentEncryptedAccessToken() {
		return consignmentEncryptedAccessToken;
	}
	public void setConsignmentEncryptedAccessToken(String consignmentEncryptedAccessToken) {
		this.consignmentEncryptedAccessToken = consignmentEncryptedAccessToken;
	}
	public List<String> getReferenceNumbers() {
		return referenceNumbers;
	}
	public void setReferenceNumbers(List<String> referenceNumbers) {
		this.referenceNumbers = referenceNumbers;
	}
	public String getEncryptedAccessToken() {
		return encryptedAccessToken;
	}
	public void setEncryptedAccessToken(String encryptedAccessToken) {
		this.encryptedAccessToken = encryptedAccessToken;
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
	public List<String> getErrors() {
		return errors;
	}
	public void setErrors(List<String> errors) {
		this.errors = errors;
	}
}
