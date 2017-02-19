package Client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import Model.Activity;

public class ActivityClient {
	Client client;


	public ActivityClient() {
		client = ClientBuilder.newClient();
	}

	public Activity get(String activityId) {

		WebTarget target = client.target("http://localhost:9090/webapi/myresource/activity");
		Activity response = target.path(activityId).request().get(Activity.class);
		return response;
	}


}
