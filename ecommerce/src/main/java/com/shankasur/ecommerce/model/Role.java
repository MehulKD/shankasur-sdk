package com.shankasur.ecommerce.model;

public enum Role {
    Customer, Admin, Supplier;

    public static String getRoleName(Role role) {
        switch (role) {
            case Customer:
                return "Customer";
            case Admin:
                return "Admin";
            case Supplier:
                return "Supplier";
            default:
                return null;
        }
    }
}