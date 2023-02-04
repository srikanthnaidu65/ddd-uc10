package com.ddd.uc10.domain;

import java.util.UUID;

/**
 * @author srikanth
 * @since 04/02/2023
 */
//Entity
public class Account {

    private UUID accountId;
    private Address address;

    public Account() {
        this.accountId = UUID.randomUUID();
    }

    protected void updateAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", address=" + address +
                '}';
    }
}
