package org.ouslimane.isaac.al.cc2al.domain.project;

import java.util.Objects;

public class Address {

    private final String value;

    private Address(String value) {
        this.value = value;
    }

    public static Address of(String value){
        return new Address(value);
    }

    @Override
    public String toString() {
        return "Address{" +
                "value='" + value + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(value, address.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
