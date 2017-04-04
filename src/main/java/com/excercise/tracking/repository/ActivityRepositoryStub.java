package com.excercise.tracking.repository;

import java.util.ArrayList;
import java.util.List;

import com.excercise.tracking.model.Type;
import com.excercise.tracking.model.User;
import com.excercise.tracking.model.Activity;

public class ActivityRepositoryStub {
	List<Activity> activities = new ArrayList<>();

	public ActivityRepositoryStub() {
		populateData();
	}

	public List<Activity> findAllActivities() {
		System.out.println("Returning Activities");
		return activities;
	}

	public List<Activity> findAllActivitiesByName() {
		System.out.println("Returning Activities based on description");
		return activities;
	}

	public Activity findActivity(String name) {
		System.out.println("finding Activity: "+name);

		Activity activity = null;
		for (Activity searchItem:activities){
			if (name.equalsIgnoreCase(searchItem.getName())){
				activity = searchItem;
				break;
			}
		}
		return activity;
	}

	/*public List<Activity> getUserActivites(String userId) {
		List<Activity> activities = null;
		for (User user:users){
			if (user.getId().equals(userId)){
				activities = user.getActivities();
			}
		}
		return activities;
	}*/

	public Activity createActivity(Activity activity) {
		System.out.println("Activity created");
		activities.add(activity);
		return activity;
	}

	public Activity createOrUpdateActivity(String id ,Activity activity) {
		// find with id if found update it otherwise create with given Id.
		System.out.println("Activity created or updated");
		activity.setId(Integer.valueOf(id));
		activities.add(activity);
		return activity;
	}

	public void deleteActivity(String id) {
		// find with id if found update it otherwise create with given Id.
		System.out.println("Activity deleted with:"+id);
	}

	private void populateData() {
		User user = new User();
		user.setId("1");
		user.setName("John");

		Activity activity1 = new Activity();
		activity1.setId(1);
		activity1.setName("walking");
		activity1.setType(Type.OFFICE);
		activity1.setDuration(1);
		activity1.setDescription("This is walking");
		activities.add(activity1);

		Activity activity2 = new Activity();
		activity2.setId(2);
		activity2.setName("deadlift");
		activity2.setType(Type.GYM);
		activity2.setDuration(1);
		activity2.setDescription("This is deadlift");
		activities.add(activity2);
		user.setActivities(activities);
	}
}
