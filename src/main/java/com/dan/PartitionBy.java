package com.dan;
import java.util.*;
import java.util.stream.*;

public class PartitionBy {


	public static Map<Boolean, List<Person>> partitionAdults(List<Person> people) {
		 return people.stream()
                .collect(Collectors.partitioningBy(p -> p.getAge() >= 18));
	}
}