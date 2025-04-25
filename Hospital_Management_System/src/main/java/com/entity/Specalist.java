package com.entity;

public class Specalist {
	private int id;
	private String spacialistName;
	
	
	public Specalist() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Specalist(int id, String spacialistName) {
		super();
		this.id = id;
		this.spacialistName = spacialistName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSpacialistName() {
		return spacialistName;
	}
	public void setSpacialistName(String spacialistName) {
		this.spacialistName = spacialistName;
	}

}
