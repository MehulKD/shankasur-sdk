package com.shankasur.ecommerce.model;

public class Address {
    private long addressId;
    private String streetAddress;
    private String city;
    private String state;
    private String zipCode;
    private String country;

    public String getStreetAddress() {
        return streetAddress;
    }


    public long getAddressid() {
        return addressId;
    }

    public void setAddressid(long addressid) {
        this.addressId = addressid;
    }


    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipCode;
    }

    public void setZipcode(String zipcode) {
        this.zipCode = zipcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
