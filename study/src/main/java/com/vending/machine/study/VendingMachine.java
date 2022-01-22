package com.vending.machine.study;

public class VendingMachine {

    private int change;

    public void put(final int change) {
        this.change += change;
    }

    public int getChanges() {
        return change;
    }
}
