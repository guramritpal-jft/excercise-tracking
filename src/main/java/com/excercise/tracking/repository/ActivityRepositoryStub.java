package com.excercise.tracking.repository;

import java.util.ArrayList;
import java.util.List;

import com.excercise.tracking.model.User;
import com.excercise.tracking.model.Activity;

public class ActivityRepositoryStub {
	List<Activity> activities = new ArrayList<>();
	List<User> users = new ArrayList<>();

	public ActivityRepositoryStub() {
		populateData();
	}

	public List<Activity> findAllActivities() {
		return activities;
	}

	public Activity findActivity(String name) {
		Activity activity = null;
		for (Activity activity1:activities){
		  if (activity1.getDescription().equals(name)){
			activity = activity1;
		  }
		}
		return activity;
	}

	public List<Activity> getUserActivites(String userId) {
		List<Activity> activities = null;
		for (User user:users){
			if (user.getId().equals(userId)){
				activities = user.getActivities();
			}
		}
		return activities;
	}

	public Activity createActivity(Activity activity) {
		System.out.println("Activity created");
		activities.add(activity);
		return activity;
	}

	private void populateData() {
		User user = new User();
		user.setId("1");
		user.setName("John");

		Activity activity1 = new Activity();
		activity1.setId(1);
		activity1.setDuration(1);
		activity1.setDescription("walking");
		activities.add(activity1);

		Activity activity2 = new Activity();
		activity2.setId(2);
		activity2.setDuration(1);
		activity2.setDescription("deadlift");
		activities.add(activity2);
		user.setActivities(activities);
	}
}
