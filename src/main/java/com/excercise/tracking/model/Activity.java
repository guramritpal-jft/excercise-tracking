package com.excercise.tracking.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Activity {
	private Integer id;
	private String name;
	private String description;
	private Integer duration;
	private Type type;
}
