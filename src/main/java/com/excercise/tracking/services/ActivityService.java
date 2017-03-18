package com.excercise.tracking.services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.excercise.tracking.repository.ActivityRepositoryStub;
import com.excercise.tracking.model.Activity;

@Path("/activites")
public class ActivityService {
	private ActivityRepositoryStub activityResourceStub =  new ActivityRepositoryStub();

	@GET
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public List<Activity> getAllActivites() {
		System.out.println("getAllActivites...........");
		return activityResourceStub.findAllActivities();
	}

	@GET
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	@Path("{activityName}")
	public Activity getActivity(@PathParam("activityName") String activityName) {
		System.out.println("getActivity...........");
		return activityResourceStub.findActivity(activityName);
	}

	@POST
	@Path("create")
	@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	@Produces(MediaType.APPLICATION_JSON)
	public Activity createActivity(Activity activity) {
		System.out.println("Creating Activity.....");
		return activityResourceStub.createActivity(activity);
	}

}
