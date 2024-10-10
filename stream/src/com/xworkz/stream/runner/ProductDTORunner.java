package com.xworkz.stream.runner;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.stream.dto.ProductDTO;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ProductDTORunner {
    public static void main(String[] args) {
        Collection<ProductDTO> products = new ArrayList<>();
        
        products.add(new ProductDTO(1, "Bag", "Amazon", 6000));
        products.add(new ProductDTO(2, "Fridge", "Flipkart", 15000));
        products.add(new ProductDTO(3, "Dress", "AJIO", 3000));
        products.add(new ProductDTO(4, "TV", "Flipkart", 25000));
        products.add(new ProductDTO(5, "Phone", "Flipkart", 10000));
        products.add(new ProductDTO(6, "Watch", "Amazon", 20000));
        products.add(new ProductDTO(7, "Sofa", "Flipkart", 40000));
        products.add(new ProductDTO(8, "Laptop", "Reliance", 50000));
        products.add(new ProductDTO(9, "Book", "BookStore", 800));
        products.add(new ProductDTO(10, "Fan", "Amazon", 12000));

        //cost greater than 5000
        Collection<ProductDTO> productsGreaterThan5000 = products.stream()
                .filter(p -> p.getCost() > 5000)
                .collect(Collectors.toList());

        //cost greater than 5000 & less than 30000
        Collection<ProductDTO> productsInRange = products.stream()
                .filter(p -> p.getCost() > 5000 && p.getCost() < 30000)
                .collect(Collectors.toList());

        //sort in descending order by cost
        Collection<ProductDTO> productsSortedByCostDesc = products.stream()
                .sorted(Comparator.comparing(ProductDTO::getCost).reversed())
                .collect(Collectors.toList());

        //product where vendor names starts with A and sort by ascending order by name
        Collection<ProductDTO> productsVendorA = products.stream()
                .filter(p -> p.getVendor().startsWith("A"))
                .sorted(Comparator.comparing(ProductDTO::getName))
                .collect(Collectors.toList());

        //sort by cost & id
        Collection<ProductDTO> productsSortedByCostAndId = products.stream()
                .sorted(Comparator.comparing(ProductDTO::getCost)
                        .thenComparing(ProductDTO::getId))
                .collect(Collectors.toList());

        //Collect only names from product
        Collection<String> productNames = products.stream()
                .map(ProductDTO::getName)
                .collect(Collectors.toList());

        //Collect only id's from product
        Collection<Integer> productIds = products.stream()
                .map(ProductDTO::getId)
                .collect(Collectors.toList());

        //Collect product by converting name to Uppercase
        Collection<ProductDTO> productsWithUppercaseNames = products.stream()
                .map(p -> new ProductDTO(p.getId(), p.getName().toUpperCase(), p.getVendor(), p.getCost()))
                .collect(Collectors.toList());

        System.out.println("Products cost greater than 5000: " + productsGreaterThan5000);
        System.out.println("Products cost between 5000 and 30000: " + productsInRange);
        System.out.println("Products sorted by cost (desc): " + productsSortedByCostDesc);
        System.out.println("Products from vendors starting with 'A' sorted by name: " + productsVendorA);
        System.out.println("Products sorted by cost and id: " + productsSortedByCostAndId);
        System.out.println("Product names: " + productNames);
        System.out.println("Product ids: " + productIds);
        System.out.println("Products with uppercase names: " + productsWithUppercaseNames);
    }
}
