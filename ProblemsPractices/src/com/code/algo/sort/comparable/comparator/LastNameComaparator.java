package com.code.algo.sort.comparable.comparator;

import java.util.Comparator;

public class LastNameComaparator implements Comparator<PersonComparator>{

	@Override
	public int compare(PersonComparator person, PersonComparator anotherPerson) {
		
		if(!(person.getlName().equals(anotherPerson.getlName()))) {
			return person.getlName().compareTo(anotherPerson.getlName());
		} else {
			return person.getfName().compareTo(anotherPerson.getfName());
		}
	}

}
