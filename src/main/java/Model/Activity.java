package Model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;
import lombok.NoArgsConstructor;

/*	LAMBOK:
	===========
	1. No argument constructor mandatory.
	2. Lambok generate all the boilerplate code for us at compile time.
* */

@XmlRootElement(name = "activity")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@NoArgsConstructor
public class Activity {

	@XmlElement(name = "name")
	private String activityName;
	private Integer duration;
	private Long id;
	private List<User> user;

	public Activity(Long id, String activityName, Integer duration) {
		this.id = id;
		this.activityName = activityName;
		this.duration = duration;
	}
}
