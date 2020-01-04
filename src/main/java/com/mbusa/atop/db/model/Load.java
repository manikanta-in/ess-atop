package com.mbusa.atop.db.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(schema="kite",name = "bz_load")
public class Load implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "load_id", unique = true, nullable = false)
	private long id;
	
	
	@Column(name = "message_type",nullable = false)
    private String messageType;

	@Column(name = "success",nullable = false)
    private boolean success;
	
	
	@Column(name = "four_kites_load_id",nullable = false)
    private Long fourKitesLoadId;

	@Column(name = "load_number",nullable = false)
    private String loadNumber;

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
	
	
	
	

}
