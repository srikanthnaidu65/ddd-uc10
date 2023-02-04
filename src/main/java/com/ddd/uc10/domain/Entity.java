package com.ddd.uc10.domain;

/**
 * @author srikanth
 * @since 04/02/2023
 */
public interface Entity<T> {
    public boolean hasSameIdentityAs(T other);
}
