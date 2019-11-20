package com.shankasur.ecommerce.model;

import java.util.HashSet;
import java.util.Set;

public class Product {
    private long productId;
    private String name;
    private int price;
    private String description;
    private int availability;
    private Category category;
    private String productPictureUrlString;
    private Supplier supplier;
    private Set<ProductReview> reviews;

    public Product() {
        reviews = new HashSet<ProductReview>();
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability2) {
        this.availability = availability2;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getProductPictureUrlString() {
        return productPictureUrlString;
    }

    public void setProductPictureUrlString(String productPictureUrlString) {
        this.productPictureUrlString = productPictureUrlString;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public Set<ProductReview> getReviews() {
        return reviews;
    }

    public void setReviews(Set<ProductReview> reviews) {
        this.reviews = reviews;
    }
}
