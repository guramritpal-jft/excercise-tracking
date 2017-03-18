package com.excercise.tracking.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@XmlRootElement
public class User {
	private String Id;
	private String name;
	private List<Activity> activities;
}
