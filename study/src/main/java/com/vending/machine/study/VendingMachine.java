package com.vending.machine.study;

public class VendingMachine {

    private int changes;

    public void put(final int changes) {
        this.changes += changes;
    }

    public int getChanges() {
        return changes;
    }

    public VendingMachine() {
        this.changes = 0;
    }
    public VendingMachine(final int changes) {
        this.changes = changes;
    }
}
