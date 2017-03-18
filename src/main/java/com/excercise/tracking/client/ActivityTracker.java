package com.excercise.tracking.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import com.excercise.tracking.model.Activity;

/**
 * Created by guramritpal on 18/3/17.
 */
public class ActivityTracker {
	private Client client;
	WebTarget target ;

	public ActivityTracker() {
		client = ClientBuilder.newClient();
		target = client.target("http://localhost:8080/tracking-web/");
	}

	public Activity getActivity(String name) {
		Activity response = target.path("activites/"+name)
				.request()
				.get(Activity.class);
		return response;
	}

}
