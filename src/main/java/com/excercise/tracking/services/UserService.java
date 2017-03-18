package com.excercise.tracking.services;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.excercise.tracking.model.Activity;
import com.excercise.tracking.repository.ActivityRepositoryStub;

@Path("/users")
public class UserService {
	private ActivityRepositoryStub activityResourceStub =  new ActivityRepositoryStub();

	@GET
	@Path("{userId}/activites")
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public List<Activity> getUser(@PathParam("userId") String userId){
	return activityResourceStub.getUserActivites(userId);
	}
}
