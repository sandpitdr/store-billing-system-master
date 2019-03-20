package com.mk.billingsystem.domain;

public enum DiscountType {
    AFFILIATE(10),EMPLOYEE(30),CUSTOMER(5);

    private double discountPercentage;

    DiscountType(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }
}
