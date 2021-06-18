package com.dan;
import java.util.*;
import java.util.stream.*;

public class GroupBy {

    public static Map<String, List<Person>> groupByNationality(List<Person> people) {
		return people.stream()
                .collect(Collectors.groupingBy(Person::getNationality));
	}

}