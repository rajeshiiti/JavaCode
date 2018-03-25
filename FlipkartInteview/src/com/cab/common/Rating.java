package com.cab.common;

import java.util.HashMap;
import java.util.Map;

public class Rating {
	
	private String id;
	private float avgRating;
	private int numberOfRides;
	private Map<String, RatingInput> ratingData;
	
	public Rating(String id) {
		super();
		this.id = id;
		this.avgRating = 0;
		this.ratingData = new HashMap<String, RatingInput>();
		this.numberOfRides = 0;
	}
	
	public void rateMe(String selfId, float rating, String raterId, float raterRating) {
		if(this.numberOfRides==0) {
			this.avgRating = (float)rating;
			this.numberOfRides +=1;
		} else {
			float prevTotal = (float)(this.avgRating* (float)(this.numberOfRides));
			this.numberOfRides +=1;
			this.avgRating = (prevTotal + rating)/(float)numberOfRides;
		}
		updateRatingData(raterRating, raterId);
	}
	
	private void updateRatingData(float rating, String raterId) {
		RatingInput raterObj = null;
		if(this.ratingData.containsKey(raterId)) {
			raterObj = this.ratingData.get(raterId);
		} else {
			raterObj = new RatingInput(raterId);
		}
		raterObj.setRating(rating);
		ratingData.put(raterId, raterObj);
		// TODO Auto-generated method stub
		
	}

	public String getId() {
		return id;
	}
	
	public float getAvgRating() {
		return avgRating;
	}

	public Map<String, RatingInput> getRatingData() {
		return ratingData;
	}
	
	
	
	
	
	
	
	

}
