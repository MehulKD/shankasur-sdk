package com.shankasur.ecommerce.model;

public class ProductReview 
{
    private long reviewId;
    private String review;
    private Customer customer;

    public ProductReview(){

    }
    public ProductReview(String review,Customer customer){
        this.review=review;
        this.customer=customer;
    }
    public long getReviewId() {
        return reviewId;
    }
    public void setReviewId(long reviewId) {
        this.reviewId = reviewId;
    }
    public String getReview() {
        return review;
    }
    public void setReview(String review) {
        this.review = review;
    }
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
