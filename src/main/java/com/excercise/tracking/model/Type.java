package com.excercise.tracking.model;

public enum Type {
	HOME("Home"),
	GYM("Gym"),
	OFFICE("Office");

	private String type;

	Type(String type) {
		this.type = type;
	}
	public String getType(){
		return type;
	}
}
