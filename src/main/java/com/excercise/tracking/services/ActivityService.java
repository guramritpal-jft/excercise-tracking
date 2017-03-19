package com.excercise.tracking.services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.excercise.tracking.model.Activity;
import com.excercise.tracking.repository.ActivityRepositoryStub;

@Path("/activities")
public class ActivityService {
	private ActivityRepositoryStub activityResourceStub =  new ActivityRepositoryStub();

	@GET
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public List<Activity> getAllActivities() {
		System.out.println("getAllActivities...........");
		return activityResourceStub.findAllActivities();
	}

	@GET
	@Path("/search")
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public Response getAllActivitiesByName(@QueryParam(value = "name") String name) {
		System.out.println("getAllActivities filters ..........");
		List<Activity> activities = activityResourceStub.findAllActivitiesByName();
		GenericEntity<List<Activity>> list = new GenericEntity<List<Activity>>(activities) {};
		return Response.ok().entity(list).build();
	}

	@GET
	@Path("{activityName}")
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public Response getActivity(@PathParam("activityName") String activityName) {
		System.out.println("getActivity...........");
		if (activityName.length()<=0){
			System.out.println("Bad Request......");
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
		Activity activity = activityResourceStub.findActivity(activityName);
		if (activity == null){
			System.out.println("Activity not found........");
			return Response.status(Response.Status.NOT_FOUND).build();
		}
		return Response.ok().entity(activity).build();
	}

	@POST
	@Path("create")
	@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	@Produces(MediaType.APPLICATION_JSON)
	public Response createActivity(Activity activity) {
		System.out.println("Creating Activity.....");
		Activity response = activityResourceStub.createActivity(activity);
		return Response.ok().entity(response).build();
	}

	@PUT
	@Path("update/{activityId}")
	@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	@Produces(MediaType.APPLICATION_JSON)
	public Response createOrUpdateActivity(@PathParam("activityId") String activityId, Activity activity) {
		System.out.println("Creating or updating Activity.....");
		Activity response = activityResourceStub.createOrUpdateActivity(activityId, activity);
		return Response.ok().entity(response).build();
	}

	@DELETE
	@Path("delete/{activityId}")
	@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	@Produces(MediaType.APPLICATION_JSON)
	public Response deleteActivity(@PathParam("activityId") String activityId) {
		System.out.println("deleting Activity.....");
		activityResourceStub.deleteActivity(activityId);
		return Response.ok().build();
	}
}
