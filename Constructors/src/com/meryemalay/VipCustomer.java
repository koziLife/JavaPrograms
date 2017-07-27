package com.meryemalay;

public class VipCustomer {

    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer() {
        this("Default", 1000.00,"xyz@email.com");
        System.out.println("Empty custructor called.");
    }

    public VipCustomer(String name, double creditLimit, String emailAddress) {
        System.out.println("Constructor with parameters called.");
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public VipCustomer(String name, double creditLimit) {
        this(name,creditLimit, "abc@email.com");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
