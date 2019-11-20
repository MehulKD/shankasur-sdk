package com.shankasur.ecommerce.model;

import java.util.Set;

public class Customer
{
    private long customerid;
    private String customerfirstname;
    private String customerlastname;
    private Address address;
    private UserAccount userAccountBean;
    private Set<CartItem> cartItems;
}
