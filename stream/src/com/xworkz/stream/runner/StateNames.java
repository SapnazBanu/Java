package com.xworkz.stream.runner;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.Collections;

public class StateNames {
	public static void main(String[] args) {

		List<String> stateNames = Arrays.asList("Andhra Pradesh","Arunachal Pradesh","Assam","Bihar","Chhattisgarh","Goa","Gujarat","Haryana","Himachal Pradesh","Jharkhand","Karnataka","Kerala","Madhya Pradesh","Maharashtra","Manipur","Meghalaya","Mizoram","Nagaland","Odisha","Punjab","Rajasthan","Sikkim","Tamil Nadu","Telangana","Tripura","Uttar Pradesh","Uttarakhand","West Bengal");

		List<String> ascendingStateNames = stateNames.stream().sorted().collect(Collectors.toList());
		System.out.println("State names sorted in ascending order: " + ascendingStateNames);


		List<String> descendingStateNames = stateNames.stream().sorted(Collections.reverseOrder())
				.collect(Collectors.toList());
		System.out.println("State names sorted in descending order: " + descendingStateNames);
	}
}
