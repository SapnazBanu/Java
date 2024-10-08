package com.xworkz.enumCreation.constants.DTO;

import com.xworkz.enumCreation.constants.ProductType;

public class CustomerDTO {
    private String name;
    private String email;
    private ProductType productType;

    public CustomerDTO(String name, String email, ProductType productType) {
        this.name = name;
        this.email = email;
        this.productType = productType;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public ProductType getProductType() {
        return productType;
    }
}