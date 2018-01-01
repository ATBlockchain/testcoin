package com.company;

import java.time.LocalDateTime;
import java.util.List;

public class Block {
    private String prevBlock;
    private String merkleRoot;
    private LocalDateTime timestamp;
    private Long nonce;
    private List<Transaction> transactions;

    public String getPrevBlock() {
        return prevBlock;
    }

    public void setPrevBlock(String prevBlock) {
        this.prevBlock = prevBlock;
    }

    public String getMerkleRoot() {
        return merkleRoot;
    }

    public void setMerkleRoot(String merkleRoot) {
        this.merkleRoot = merkleRoot;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
    
    public Long getNonce() {
        return nonce;
    }

    public void setNonce(Long nonce) {
        this.nonce = nonce;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }
}
