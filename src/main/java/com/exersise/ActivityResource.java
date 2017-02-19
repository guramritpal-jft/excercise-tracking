package com.exersise;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import lombok.extern.slf4j.Slf4j;

import Model.Activity;
import Model.ActivityWS;
import Model.ExersiseHelper;
import Model.User;
import Repository.ActivityrepositoryImpl;

@Slf4j
@Path("myresource")  //http://localhost:9090/webapi/myresource
public class ActivityResource {

	ActivityrepositoryImpl activityrepository = new ActivityrepositoryImpl();


	@POST
	@Path("activity")  //http://localhost:9090/webapi/myresource/activity
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_JSON)
	public Response createActivity(ActivityWS activityWS) {

		log.info("Validating payload===========");
		ExersiseHelper.validate(activityWS);

		Activity activity = new Activity();
		activity.setId(activityWS.getId());
		activity.setActivityName(activityWS.getActivityName());
		activity.setDuration(activityWS.getDuration());

		log.info("activity created ===============");
		return Response.ok().build();
	}

	@GET
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public List<Activity> readActivities() {
		return activityrepository.findAllActivities();
	}

	@GET
	@Path("{activityId}")  //http://localhost:9090/webapi/myresource/{activityId}
	public Activity getActivity(@PathParam("activityId") String activityId) {
		return activityrepository.getActivity(activityId);
	}

	@GET
	@Path("{activityId}/users")  //http://localhost:9090/webapi/myresource/{activityId}/users
	public List<User> getActivityUsers(@PathParam("activityId") String activityId) {
		System.out.println("bvvvvvvv");
		return activityrepository.getActivityUsers(activityId);
	}
}
