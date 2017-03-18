package com.com.excercise.tracking;

import org.testng.annotations.Test;

import com.excercise.tracking.client.ActivityTracker;
import com.excercise.tracking.model.Activity;

public class client {
	ActivityTracker activityTracker =  new ActivityTracker();
	@Test
	public void test_getActivity() {
	Activity activity = activityTracker.getActivity("walking");
		System.out.println(activity);
	}
}
