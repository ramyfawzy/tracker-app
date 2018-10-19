package com.gamigo.tracker.model;

import java.io.Serializable;

public class Country implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private Long successDownloads;
	private Long failDownloads;
	private Double percentage;
	
	public Country() {
		
	}

	public Country(String name, Long successDownloads, Long failDownloads, Double percentage) {
		super();
		this.name = name;
		this.successDownloads = successDownloads;
		this.failDownloads = failDownloads;
		this.percentage = percentage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getSuccessDownloads() {
		return successDownloads;
	}

	public void setSuccessDownloads(Long successDownloads) {
		this.successDownloads = successDownloads;
	}

	public Long getFailDownloads() {
		return failDownloads;
	}

	public void setFailDownloads(Long failDownloads) {
		this.failDownloads = failDownloads;
	}

	public Double getPercentage() {
		return percentage;
	}

	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}
	
	

	
	

}
