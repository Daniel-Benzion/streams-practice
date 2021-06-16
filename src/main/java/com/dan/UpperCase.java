package com.dan;
import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.*;


public class UpperCase {

    public static Collection<String> mapToUppercase(String... names) {
	    Collection<String> uppercaseNames = 
    
        Arrays.asList(names).stream()
        .map(e -> e.toUpperCase())
        .collect(Collectors.toList());

	    return uppercaseNames;
    }

}
