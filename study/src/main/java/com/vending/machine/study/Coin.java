package com.vending.machine.study;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Coin {

    private final int value;

    Coin(final int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Coin coin = (Coin) o;
        return value == coin.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "Coin{" +
                "value" + value +
                "}" ;
    }
}
