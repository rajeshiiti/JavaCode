package com.cab.common;

import java.util.ArrayList;
import java.util.List;

public class RatingInput {
	
	private String id;
	private int numberOfRide;
	private float avgRating;
	private List<Float> ratingList;
	private boolean isEligible;

	public RatingInput(String id) {
		super();
		this.id = id;
		this.numberOfRide = 0;
		this.avgRating = 0;
		this.ratingList = new ArrayList<Float>();
		this.isEligible = true;
	}
	
	public void setRating(float rating) {
		// Assuming rating value validation done before 0<=rating<=5
		this.ratingList.add(rating);
		this.numberOfRide +=1;
		if (rating==1) {
			this.isEligible = false;
		}
		this.calculateAvgRating(rating);
		
	}
	
	private void calculateAvgRating(float rating) {
		if(this.numberOfRide==1) {
			this.avgRating = (float)rating;
		} else {
			float prevTotal = (float)(this.avgRating* (float)(this.numberOfRide-1));
			this.avgRating = (prevTotal + rating)/(float)numberOfRide;
			
		}
	}
	
	public String getId() {
		return id;
	}

	public int getNumberOfRide() {
		return numberOfRide;
	}

	public float getAvgRating() {
		return avgRating;
	}

	public List<Float> getRatingList() {
		return ratingList;
	}

	public boolean isEligible() {
		return isEligible;
	}
	
	
	
	

}
