package com.mbusa.atop.db.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;


import com.vladmihalcea.hibernate.type.json.JsonBinaryType;


@Entity
@Table(schema="kite",name = "bz_load")

@TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
public class Load implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private long id;


	@Column(name = "message_type",nullable = false)
	private String messageType;


	@Column(name = "four_kites_load_id",nullable = false)
	private Long fourKitesLoadId;

	@Column(name = "load_number",nullable = false)
	private String loadNumber;

	@Column(name = "pro_number")
	private String proNumber;

	@Column(name = "success")
	private boolean success;

	@Column(name = "stop_reference_id")
	private int stopReferenceId;

	@Column(name = "scac")
	private String scac;

	@Column(name = "shipper")
	private String shipper;


	@Type(type = "jsonb")
	@Column(name = "tags")
	private List<String> tags;

	@Column(name = "consignment_encrypted_token")
	private String consignmentEncryptedToken;

	@Column(name = "encrypted_access_token")
	private String encryptedAccessToken;


	@Type(type = "jsonb")
	@Column(name = "reference_numbers")
	private List<String> referenceNumbers;

	@Column(name = "timestamp")
	private Timestamp timestamp;

	@Column(name = "timezone_short_name")
	private String timezoneShortName;


	@Column(name = "timezone_offset")
	private int timezoneOffset;


	@Column(name = "stop_type")
	private String stopType;

	@Column(name = "stop_name")
	private String stopName;

	@Column(name = "location")
	private String location;



	@Column(name = "city")
	private String city;



	@Column(name = "state")
	private String state;

	@Column(name = "contry")
	private String contry;


	@Column(name = "latitude")
	private String latitude;

	@Column(name = "longitude")
	private String longitude;

	@Column(name = "status_code")
	private String statusCode;

	@Column(name = "odometer_reading")
	private Long odometerReading;


	@Type(type = "jsonb")
	@Column(name = "errors")
	private List<String> errors;



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMessageType() {
		return messageType;
	}

	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public Long getFourKitesLoadId() {
		return fourKitesLoadId;
	}

	public void setFourKitesLoadId(Long fourKitesLoadId) {
		this.fourKitesLoadId = fourKitesLoadId;
	}

	public String isLoadNumber() {
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

	public int getStopReferenceId() {
		return stopReferenceId;
	}

	public void setStopReferenceId(int stopReferenceId) {
		this.stopReferenceId = stopReferenceId;
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

	public String getConsignmentEncryptedToken() {
		return consignmentEncryptedToken;
	}

	public void setConsignmentEncryptedToken(String consignmentEncryptedToken) {
		this.consignmentEncryptedToken = consignmentEncryptedToken;
	}

	public String getEncryptedAccessToken() {
		return encryptedAccessToken;
	}

	public void setEncryptedAccessToken(String encryptedAccessToken) {
		this.encryptedAccessToken = encryptedAccessToken;
	}

	public List<String> getReferenceNumbers() {
		return referenceNumbers;
	}

	public void setReferenceNumbers(List<String> referenceNumbers) {
		this.referenceNumbers = referenceNumbers;
	}

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

	public String getTimezoneShortName() {
		return timezoneShortName;
	}

	public void setTimezoneShortName(String timezoneShortName) {
		this.timezoneShortName = timezoneShortName;
	}

	public int getTimezoneOffset() {
		return timezoneOffset;
	}

	public void setTimezoneOffset(int timezoneOffset) {
		this.timezoneOffset = timezoneOffset;
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

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public Long getOdometerReading() {
		return odometerReading;
	}

	public void setOdometerReading(Long odometerReading) {
		this.odometerReading = odometerReading;
	}

	public List<String> getErrors() {
		return errors;
	}

	public void setErrors(List<String> errors) {
		this.errors = errors;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getLoadNumber() {
		return loadNumber;
	}

	public String getStopType() {
		return stopType;
	}

	public void setStopType(String stopType) {
		this.stopType = stopType;
	}

	public String getStopName() {
		return stopName;
	}

	public void setStopName(String stopName) {
		this.stopName = stopName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}



}
