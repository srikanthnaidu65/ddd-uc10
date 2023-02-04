package com.ddd.uc10.domain;

/**
 * @author srikanth
 * @since 04/02/2023
 */
public class Address {
    private String city;

    public Address(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                '}';
    }
}
