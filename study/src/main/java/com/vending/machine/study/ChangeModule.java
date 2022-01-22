package com.vending.machine.study;

public class ChangeModule {

    private int changes;

    public void put(final int changes) {
        this.changes += changes;
    }

    public int getChanges() {
        return changes;
    }

    public ChangeModule() {
        this.changes = 0;
    }
    public ChangeModule(final int changes) {
        this.changes = changes;
    }

    public void withDraw(final int changes) {
        if (this.changes < changes) {
            throw new IllegalStateException();
        }
        this.changes -= changes;
    }
}
