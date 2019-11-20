package com.shankasur.ecommerce.model;

public class CartItem
{
    private long cartItemId;
    private Product product;
    private int quantity;
    private float price;

    public CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
        this.price = quantity * product.getPrice();
    }

    public long getCartItemId() {
        return cartItemId;
    }

    public void setCartItemId(long cartItemId) {
        this.cartItemId = cartItemId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice() {
        this.price = quantity * product.getPrice();
    }
}
