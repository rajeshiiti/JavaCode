package com.cab.customer;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.cab.common.Rating;
import com.cab.common.RatingInput;
import com.cab.driver.Driver;

public class Customer extends Rating{

	public Customer(String id) {
		super(id);
		// TODO Auto-generated constructor stub
	}
	
	public Map<String, Float> getEligibleDrivers(Map<String, Driver> driverList) {
		Map<String, Float> eligibleDrivers = new HashMap<String, Float>();
		Map<String, RatingInput> ratingData = this.getRatingData();
		for (Entry<String, Driver> entry : driverList.entrySet()) {
			Driver value = entry.getValue();
		    if(value.getAvgRating()>=this.getAvgRating()) {
		    	eligibleDrivers.put(entry.getKey(), entry.getValue().getAvgRating());
		    }
		}
		if(eligibleDrivers.isEmpty()) {
			for (Entry<String, Driver> entry : driverList.entrySet()) {
			    eligibleDrivers.put(entry.getKey(), entry.getValue().getAvgRating());
			}
		}
		for (Entry<String, RatingInput> entry : ratingData.entrySet()) {
			RatingInput value = entry.getValue();
		    if(!value.isEligible()) {
		    	eligibleDrivers.remove(entry.getKey());
		    }
		}
		return eligibleDrivers;
	}
	
	

}
