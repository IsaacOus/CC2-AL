package org.ouslimane.isaac.al.cc2al.domain;

import java.util.Objects;

public final class Job {

    private final String value;

    public Job(String value) {
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return value.equals(job.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "Job{" +
                "value='" + value + '\'' +
                '}';
    }
}
