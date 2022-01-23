package com.vending.machine.study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Changes {

    private int amount;

    public Changes(int amount) {
        this.amount = amount;
    }

    List<CoinSet> coin() {

        List<CoinSet> list = new ArrayList<>();
        for (CoinSet coin : CoinSet.values()) {
            final int count = amount / coin.value;
            for (int i = 0; i < count; i++) {
                list.add(coin);
            }
            amount -= count * coin.value;
        }
        return list;
    }
}
