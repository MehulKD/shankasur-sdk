package com.shankasur.ecommerce.model;

import java.util.ArrayList;

public class Shipment
{
    private long shipmentTrackingID;
    private static int count;
    private String shipmentstatus;
    private Address address;
    private ArrayList<OrderItem> orderItem;
    java.util.Date date= new java.util.Date();
    private String shippedDate=String.valueOf(date);
    private String deliveredDate=String.valueOf(date);
    private String deliveryComments;

    public Shipment(){
        count++;
        shipmentTrackingID=count;
    }

    public long getShipmentTrackingID() {
        return shipmentTrackingID;
    }

    public void setShipmentTrackingID(long shipmentTrackingID) {
        this.shipmentTrackingID = shipmentTrackingID;
    }

    public String getShipmentstatus() {
        return shipmentstatus;
    }

    public void setShipmentstatus(String shipmentstatus) {
        this.shipmentstatus = shipmentstatus;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public ArrayList<OrderItem> getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(ArrayList<OrderItem> orderItem) {
        this.orderItem = orderItem;
    }

    public String getShippedDate() {
        return shippedDate;
    }

    public void setShippedDate(String shippedDate) {
        this.shippedDate = shippedDate;
    }

    public String getDeliveredDate() {
        return deliveredDate;
    }

    public void setDeliveredDate(String deliveredDate) {
        this.deliveredDate = deliveredDate;
    }

    public String getDeliveryComments() {
        return deliveryComments;
    }

    public void setDeliveryComments(String deliveryComments) {
        this.deliveryComments = deliveryComments;
    }
}
