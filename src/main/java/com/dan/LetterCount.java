package com.dan;

import java.util.stream.*;
import java.util.*;

public class LetterCount {

    public static int getTotalNumberOfLettersOfNamesLongerThanFive(String... names) {
        int result = 
    
        Arrays.asList(names).stream()
        .filter(e -> e.length() > 5)
        .mapToInt(e -> e.length())
        .sum();
    
        return result;
    }
}
