package Repository;

import java.util.ArrayList;
import java.util.List;

import Model.Activity;
import Model.User;

public class ActivityrepositoryImpl implements ActivityRepository {

	public List<Activity> findAllActivities() {
		List<Activity> list = new ArrayList<Activity>();
		Activity swimming = new Activity(1L, "Swimming", 200);
		Activity cricket = new Activity(2L, "Cricket", 100);

		User gagan = new User("Gagan,", 101);
		User prashant = new User("Prashant,", 102);
		User amrit = new User("Amrit,", 103);
		User ankit = new User("Ankit,", 104);

		List<User> cricketUsersList = new ArrayList<User>();
		cricketUsersList.add(gagan);
		cricketUsersList.add(prashant);

		List<User> swimmingUsersList = new ArrayList<User>();
		swimmingUsersList.add(amrit);
		swimmingUsersList.add(ankit);

		swimming.setUser(swimmingUsersList);
		cricket.setUser(cricketUsersList);

		list.add(swimming);
		list.add(cricket);

		System.out.println("lsis=========");
		System.out.println(list.get(0).getUser());
		System.out.println(list.get(1).getUser());
		return list;
	}

	public Activity getActivity(String activityId) {
		return activityId.equals(1) ? new Activity(1L, "Swimming", 200) : new Activity(2L, "Cricket", 100);
	}

	public List<User> getActivityUsers(String activityId) {
		List<Activity> activities = findAllActivities();
		System.out.println(activities);
		for (Activity activity : activities) {
			if (activity.getId() == Integer.parseInt(activityId)) {
				System.out.println("yesssssssss");
				System.out.println(activity.getUser());
				return activity.getUser();
			}
		}
		return null;
	}

}
