package com.shankasur.ecommerce.model;

public class Supplier
{
    private long supplierid;
    private String suppliername;
    private Address address;
    private UserAccount userAccount;
    public Supplier(){

    }
    public Supplier(String suppliername,Address address,UserAccount userAccount){
        this.suppliername=suppliername;
        this.address=address;
        this.userAccount=userAccount;
    }
    public long getSupplierid() {
        return supplierid;
    }
    public void setSupplierid(long supplierid) {
        this.supplierid = supplierid;
    }
    public String getSuppliername() {
        return suppliername;
    }
    public void setSuppliername(String suppliername) {
        this.suppliername = suppliername;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public UserAccount getUserAccount() {
        return userAccount;
    }
    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }
}
