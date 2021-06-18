package com.dan;
import java.util.*;
import java.util.stream.*;

public class SumAndReduce {

    public static int calculate(List<Integer> numbers) {

		return numbers.stream()
        .reduce(0, (total, number) -> total + number);
	}

}