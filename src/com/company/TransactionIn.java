package com.company;

public class TransactionIn {
    private OutPoint previousOutPoint;

    public OutPoint getPreviousOutPoint() {
        return previousOutPoint;
    }

    public void setPreviousOutPoint(OutPoint previousOutPoint) {
        this.previousOutPoint = previousOutPoint;
    }
}
