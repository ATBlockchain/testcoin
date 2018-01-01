package com.company;

import java.util.ArrayList;
import java.util.List;

public class Transaction {

    private List<TransactionIn> transactionIns = new ArrayList<TransactionIn>();
    private List<TransactionOut> transactionOuts = new ArrayList<TransactionOut>();

    public List<TransactionIn> getTransactionIns() {
        return transactionIns;
    }

    public void setTransactionIns(List<TransactionIn> transactionIns) {
        this.transactionIns = transactionIns;
    }

    public List<TransactionOut> getTransactionOuts() {
        return transactionOuts;
    }

    public void setTransactionOuts(List<TransactionOut> transactionOuts) {
        this.transactionOuts = transactionOuts;
    }
}
