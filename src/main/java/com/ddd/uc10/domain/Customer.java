package com.ddd.uc10.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @author srikanth
 * @since 04/02/2023
 */
public class Customer {
    private UUID customerId;
    private Address address;
    private List<Account> accounts = new ArrayList<>();

    public Customer(Address address) {
        this.customerId = UUID.randomUUID();
        this.address = address;
    }

    public void addAccount(Account account) {
        accounts.add(account);
        account.updateAddress(this.address);
    }

    //Logical transaction start
    //When Customer’s Address is updated,
    // update her all Bank Accounts address as well.
    public void updateAddress(Address address) {
        this.address = address;
        accounts.forEach(account -> {
            account.updateAddress(address);
        });
    }
    //Logical transaction end


    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", address=" + address +
                ", accounts=" + accounts +
                '}';
    }
}
