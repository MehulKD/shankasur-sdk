package com.shankasur.ecommerce.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Order
{
    private long orderID;
    private Customer customer;
    private float totalPrice;
    private String orderStatus;
    private Invoice invoice;
    private Date orderDate;
    private Set<OrderItem> orderItems;

    public Order(){
        this.orderItems = new HashSet<OrderItem>();
    }

    public long getOrderID() {
        return orderID;
    }
    public void setOrderID(long orderID) {
        this.orderID = orderID;
    }
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public float getTotalPrice() {
        return totalPrice;
    }
    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }
    public String getOrderStatus() {
        return orderStatus;
    }
    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
    public Date getOrderDate() {
        return orderDate;
    }
    //	public String getOrderDateDisplay() {
//		return orderDate.toString();
//	}
    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
    public Set<OrderItem> getOrderItems() {
        return orderItems;
    }
    public void setOrderItems(Set<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }
    public void createAndAddOrderItem(OrderItem orderItem){
        getOrderItems().add(orderItem);
    }

    public void deleteOrderItem(OrderItem orderItem) {
        getOrderItems().remove(orderItem);
    }

    public float totalPrice(){
        float price = 0;
        System.out.println("entered total price");
        for(OrderItem orderItem : orderItems){
            price = price + orderItem.getprice();
        }
        return price;
    }

    public void generateInvoice(float tax){
        invoice = new Invoice();
        invoice.setCostOfOrder(Math.round(totalPrice *100)/100);
        invoice.setTaxDue(Math.round(tax*totalPrice*100)/100);
        invoice.setTotalAmount(Math.round((totalPrice*(1 + tax)*100)/100));

    }

    @Override
    public String toString() {
        return String.valueOf(orderID);
    }
}
