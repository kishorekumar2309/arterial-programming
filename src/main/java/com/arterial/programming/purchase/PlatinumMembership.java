package com.arterial.programming.purchase;

public class PlatinumMembership implements Membership {
    @Override
    public double getDiscount() {
        return 10;
    }
}
