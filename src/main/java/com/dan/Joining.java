package com.dan;
import java.util.*;
import java.util.stream.*;

public class Joining {

    public static String namesToString(List<Person> people) {
		return people.stream()
                .map(Person::getName)
                .collect(Collectors.joining(", ", "Names: ", "."));
	}

}
