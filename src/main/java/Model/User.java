package Model;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@XmlRootElement
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
public class User {

	@XmlElement(name = "user_name")
	private String name;
	@XmlElement(name = "user_id")
	private int id;

	public User(String name, int id) {
		this.name = name;
		this.id = id;
	}
}
