package com.hillel.lecture10;

import java.util.Objects;

public class Address {
    private String street;

    public Address(String street) {
        this.street = street;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Address address = (Address) o;

        return Objects.equals(street, address.street);
    }

    @Override
    public int hashCode() {
        return street != null ? street.hashCode() : 0;
    }
}
