package com.arterial.programming.purchase;

public class User {
    private final long id;
    private final String name;
    private final long mobileNumber;
    private final Membership membership;

    public User(long id, String name, long mobileNumber, Membership membership) {
        this.id = id;
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.membership = membership;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public Membership getMembership() {
        return membership;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mobileNumber=" + mobileNumber +
                ", membership=" + membership +
                '}';
    }
}
