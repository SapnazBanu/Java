package com.xworkz.stream.dto;

import java.io.Serializable;

public class ProductDTO implements Serializable {
    private int id;
    private String name;
    private String vendor;
    private double cost;

    public ProductDTO(int id, String name, String vendor, double cost) {
        this.id = id;
        this.name = name;
        this.vendor = vendor;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getVendor() {
        return vendor;
    }

    public double getCost() {
        return cost;
    }

    public int compareTo(ProductDTO other) {
        return Double.compare(this.cost, other.cost);
    }

    @Override
    public String    toString() {
        return "ProductDTO{" +
                "id=" + id + ", name='" + name + '\'' +", vendor='" + vendor + '\'' +", cost=" + cost + '}';
    }
}
