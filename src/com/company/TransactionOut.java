package com.company;

public class TransactionOut {
    private Long value;

    /**
     * Receiver address (will get hashed 160)
     */
    private String receiverPublicKey;

    //private String script;

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }

    public String getReceiverPublicKey() {
        return receiverPublicKey;
    }

    public void setReceiverPublicKey(String receiverPublicKey) {
        this.receiverPublicKey = receiverPublicKey;
    }

    /*
    public String getScript() {
        return script;
    }

    public void setScript(String script) {
        this.script = script;
    }
    */
}
