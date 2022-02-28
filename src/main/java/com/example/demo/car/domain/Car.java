package com.example.demo.car.domain;

public class Car {

	private Integer id;
	
	private String body;
	
	private String decal;
	
	private Integer credits;

	@Override
	public String toString() {
		return "rocketLeagueCar [id=" + id + "body=" + body + ", decal=" + decal + ", credits=" + credits + "]";
	}

	public Car() {
		super();
	}
	
	public Car(Integer id, String body, String decal, Integer credits) {
		super();
		this.id = id;
		this.body = body;
		this.decal = decal;
		this.credits = credits;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getDecal() {
		return decal;
	}

	public void setDecal(String decal) {
		this.decal = decal;
	}

	public Integer getCredits() {
		return credits;
	}

	public void setCredits(Integer credits) {
		this.credits = credits;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	
	
}
