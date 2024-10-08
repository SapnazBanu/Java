package com.xworkz.stream.runner;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class PrimeMinisters {
	    public static void main(String[] args) {
	        List<String> pmNames = Arrays.asList("Narendra Modi", "Manmohan Singh", "Atal Bihari Vajpayee", 
	                                             "Indira Gandhi", "Rajiv Gandhi", "Morarji Desai", 
	                                             "Lal Bahadur Shastri", "P. V. Narasimha Rao", 
	                                             "Chandra Shekhar", "Vishwanath Pratap Singh");

	        List<String> ascendingPmNames = pmNames.stream()
	                                               .sorted()
	                                               .collect(Collectors.toList());
	        System.out.println("Prime Minister names sorted in ascending order: " + ascendingPmNames);

	        List<String> descendingPmNames = pmNames.stream()
	                                                .sorted(Collections.reverseOrder())
	                                                .collect(Collectors.toList());
	        System.out.println("Prime Minister names sorted in descending order: " + descendingPmNames);
	    }
	}