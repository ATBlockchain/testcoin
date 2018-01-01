package com.company;

public class TransactionIn {
    private Outpoint previousOutput;

    public Outpoint getPreviousOutput() {
        return previousOutput;
    }

    public void setPreviousOutput(Outpoint previousOutput) {
        this.previousOutput = previousOutput;
    }
}
