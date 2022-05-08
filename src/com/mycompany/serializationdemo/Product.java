package com.mycompany.serializationdemo;

import java.io.Serializable;

public class Product implements Serializable {
    private Integer productID;
    private String productName;
    private Double productPrice;

    public Product()
    {

    }

    public Product(Integer productID, String productName, Double productPrice) {
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public Integer getProductID() {
        return productID;
    }

    public String getProductName() {
        return productName;
    }

    public Double getProductPrice() {
        return productPrice;
    }
}
