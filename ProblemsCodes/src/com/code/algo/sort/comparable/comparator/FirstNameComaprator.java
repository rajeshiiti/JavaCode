package com.code.algo.sort.comparable.comparator;

import java.util.Comparator;

public class FirstNameComaprator implements Comparator<PersonComparator>{

	@Override
	public int compare(PersonComparator person, PersonComparator anotherPerson) {
		
		if(!(person.getfName().equals(anotherPerson.getfName()))) {
			return person.getfName().compareTo(anotherPerson.getfName());
		} else {
			return person.getlName().compareTo(anotherPerson.getlName());
		}
	}

}
