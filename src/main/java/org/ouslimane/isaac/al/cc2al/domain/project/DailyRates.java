package org.ouslimane.isaac.al.cc2al.domain.project;

import java.math.BigDecimal;
import java.util.Objects;

public class DailyRates {

    private final BigDecimal value;

    private DailyRates(BigDecimal value) {
        this.value = value;
    }

    public static DailyRates of(BigDecimal value){
        return new DailyRates(value);
    }

    @Override
    public String toString() {
        return "DailyRates{" +
                "value=" + value +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DailyRates that = (DailyRates) o;
        return value.equals(that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
