package com.mk.billingsystem.domain;

public class Bill {
    public double netPaybleAmount;
    public double netDiscount;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String customerId;

    public double getNetPaybleAmount() {
        return netPaybleAmount;
    }

    public void setNetPaybleAmount(double netPaybleAmount) {
        this.netPaybleAmount = netPaybleAmount;
    }

    public double getNetDiscount() {
        return netDiscount;
    }

    public void setNetDiscount(double netDiscount) {
        this.netDiscount = netDiscount;
    }
}
