package org.ouslimane.isaac.al.cc2al.domain.project;

import java.util.Objects;

public class Skills {
    private final String value;

    private Skills(String value) {
        this.value = value;
    }

    public static Skills of(String value){
        return new Skills(value);
    }

    @Override
    public String toString() {
        return "Skills{" +
                "value='" + value + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Skills skills = (Skills) o;
        return Objects.equals(value, skills.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
