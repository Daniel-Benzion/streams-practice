package com.dan;
import java.util.*;
import java.util.stream.*;

public class AgeName {

	public static Set<String> getKidNames(List<Person> people) {
		
		return people.stream()
                .filter(person -> person.getAge() < 18)
                .map(Person::getName)
                .collect(Collectors.toSet());
	}

}