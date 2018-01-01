package com.company;

public class TransactionOut {
    private Long value;

    /*
        The recipient of the transaction.

        Subsequent TransactionIn's will have a 'signedPublickey' that must be equal to this value (when de-signed)
     */
    private String publicKey; //Equivilant to pk_script script in regular bitcoin implementation

    //private String script;

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }

    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }
}
