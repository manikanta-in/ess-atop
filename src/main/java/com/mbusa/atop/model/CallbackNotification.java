package com.mbusa.atop.model;

import java.util.List;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class CallbackNotification {

	
	@JsonProperty(value="MessageType")
	private String messageType;
	
	@JsonProperty(value="Success")
	private boolean isSuccess;
	
	@JsonProperty(value="FourKitesLoadId")
	@NotNull
	private Long fourKitesLoadId;
	
	@JsonProperty(value="LoadNumber")
	@NotNull
	private String loadNumber;
	
	@JsonProperty(value="StopReferenceId")
	private int stopReferenceId;
	
	
	@JsonProperty(value="ProNumber")
	private String proNumber;
	@JsonProperty(value="Scac")
	private String scac;
	
	@JsonProperty(value="Shipper")
	private String shipper;
	
	@JsonProperty(value="Tags")
	private List<String> tags;
	
	@JsonProperty(value="StopName")
	private String stopName;
	
	@JsonProperty(value="StopType")
	private String stopType;
	
	@JsonProperty(value="ConsignmentEncryptedAccessToken")
	private String consignmentEncryptedAccessToken;
	
	@JsonProperty(value="ReferenceNumbers")
	private List <String> referenceNumbers = null;
	
	@JsonProperty(value="EncryptedAccessToken")
	private String encryptedAccessToken;
	
	@JsonProperty(value="Timestamp")
	private String timestamp;
	
	
	@JsonProperty(value="Timezone")
	private String timezone;
	
	
	@JsonProperty(value="TimezoneShortName")
	private String timezoneShortName;
	
	@JsonProperty(value="TimezoneOffset")
	private Long timezoneOffset;
	
	@JsonProperty(value="Location")
	private String location;
	
	@JsonProperty(value="City")
	private String city;
	
	
	@JsonProperty(value="State")
	private String state;
	
	@JsonProperty(value="Contry")
	private String contry;
	
	@JsonProperty(value="Latitude")
	private String latitude;
	
	@JsonProperty(value="Longitude")
	private String longitude;
	
	@JsonProperty(value="OdometerReading")
	private Long odometerReading;	
	
	@JsonProperty(value="StatusCode")
	private String statusCode;	
	
	@JsonProperty(value="Errors")
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
	public Long getFourKitesLoadId() {
		return fourKitesLoadId;
	}
	public void setFourKitesLoadId(Long fourKitesLoadId) {
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
	public Long getTimezoneOffset() {
		return timezoneOffset;
	}
	public void setTimezoneOffset(Long timezoneOffset) {
		this.timezoneOffset = timezoneOffset;
	}
	public List<String> getErrors() {
		return errors;
	}
	public void setErrors(List<String> errors) {
		this.errors = errors;
	}

	public int getStopReferenceId() {
		return stopReferenceId;
	}
	public void setStopReferenceId(int stopReferenceId) {
		this.stopReferenceId = stopReferenceId;
	}

	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getContry() {
		return contry;
	}
	public void setContry(String contry) {
		this.contry = contry;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}


	public String getStopName() {
		return stopName;
	}
	public void setStopName(String stopName) {
		this.stopName = stopName;
	}
	public String getStopType() {
		return stopType;
	}
	public void setStopType(String stopType) {
		this.stopType = stopType;
	}
	
	public Long getOdometerReading() {
		return odometerReading;
	}
	public void setOdometerReading(Long odometerReading) {
		this.odometerReading = odometerReading;
	}
	public String getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

}
