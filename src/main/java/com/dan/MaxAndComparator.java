package com.dan;
import java.util.*;
import java.util.stream.*;

public class MaxAndComparator {

    public static Person getOldestPerson(List<Person> people) {
		return people.stream()
                .max(Comparator.comparing(Person::getAge))
                .get();
	}

}
