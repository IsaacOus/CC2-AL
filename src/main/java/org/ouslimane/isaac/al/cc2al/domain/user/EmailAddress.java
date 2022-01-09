package org.ouslimane.isaac.al.cc2al.domain.user;

import java.util.Objects;

public final class EmailAddress {

    private final String value;

    public EmailAddress(String value) {
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public String toString() {
        return "EmailAddress{" +
                "value='" + value + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmailAddress that = (EmailAddress) o;
        return value.equals(that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
