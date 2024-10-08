package com.xworkz.stream.runner;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class CollectionList {
	public static void main(String[] args) {
		List<Long> longList = Arrays.asList(500L, 50L, 25L, 40L, 75L, 60L, 45L, 10L, 20L, 15L);
		List<Long> ascendingLongList = longList.stream().sorted().collect(Collectors.toList());
		System.out.println("Long list sorted in ascending order: " + ascendingLongList);
		List<Long> descendingLongList = longList.stream().sorted(Collections.reverseOrder())
				.collect(Collectors.toList());
		System.out.println("Long list sorted in descending order: " + descendingLongList);
	}
}