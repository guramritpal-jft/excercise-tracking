package com.excercise.tracking.model;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@XmlRootElement
public class Activity {
	private Integer id;
	private String description;
	private Integer duration;
}
