package com.examples.datastructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Activity  implements Comparable<Activity>{
	int start_time;
	int end_time;
	public Activity(int start_time,int end_time) {
		this.start_time=start_time;
		this.end_time=end_time;
	}
	

	@Override
	public String toString() {
		return "Activity [start_time=" + start_time + ", end_time=" + end_time + "]";
	}
	@Override
	public int compareTo(Activity activity) {
		return this.end_time - activity.end_time;
	}
}

	public class MaxActivityCount {
		public static void addMaximumActivity(Activity activities[]) {
			List<Activity> selectedActivities=new ArrayList<Activity>();
			int selectedActivityIndex=0;
			selectedActivities.add(activities[0]);
			Activity selectedActivity=activities[0];
			for(int i=1;i<activities.length;i++) {
				Activity newActivity=activities[i];
				if(selectedActivity.end_time<newActivity.start_time) {
					selectedActivities.add(newActivity);
					selectedActivityIndex=i;
					selectedActivity=activities[i];
				}
			}
			System.out.println("Max count " + selectedActivities.size());
			System.out.println(selectedActivities);
		}
	public static void main(String[] args) {
		Activity activities[]= {
				new Activity(3,7),
				new Activity(13,15),
				new Activity(5,9),
				new Activity(6,10),
				new Activity(8,13),
				new Activity(1,4),
				new Activity(11,12),
		};
		Arrays.sort(activities);
		for(int i=0;i<activities.length;i++) {
			System.out.println(activities[i]);
		}
		addMaximumActivity(activities);
	}
}
