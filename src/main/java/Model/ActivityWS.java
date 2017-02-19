package Model;


import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.hibernate.validator.constraints.NotEmpty;


@Getter
@Setter
@NoArgsConstructor
@XmlRootElement(name = "activity")
@XmlAccessorType(XmlAccessType.FIELD)
public class ActivityWS {

	@NotEmpty
	@XmlElement(name = "name")
	private String activityName;
	private Integer duration;
	@NotNull
	private Long id;
}
