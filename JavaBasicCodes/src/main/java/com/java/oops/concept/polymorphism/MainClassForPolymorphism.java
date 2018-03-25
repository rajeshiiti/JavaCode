package com.java.oops.concept.polymorphism;

import java.util.ArrayList;

public class MainClassForPolymorphism {
	public static void main(String[] args) {
		ArrayList<Human> humans = new ArrayList<Human>();
		humans.add(new Male());
		humans.add(new Female());
		for(Human person:humans) {
			person.goPee();
		}
	}
}
