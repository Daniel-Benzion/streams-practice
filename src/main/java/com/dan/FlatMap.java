package com.dan;

import java.util.*;

import java.util.stream.Collectors;

public class FlatMap {


    public static List<String> transform(List<List<String>> collection) {
	    List<String> newCollection = 
        collection.stream()
        .flatMap(list -> list.stream())
        .collect(Collectors.toList());

	    return newCollection;
    }
}
