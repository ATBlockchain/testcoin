package com.company;

public class TransactionIn {
    private OutPoint previousOutPoint;

    /*
        - The 'previousOutPoint' attribute references an Output in a previous transaction
        - That Output will have a 'publicKey' attribute that contains the public-key of person that is allowed to spend the transaction (ie. the Sender of the CURRENT Transaction)
        - The 'signedPublicKey' attribute must equal the public-key of the CURRENT sender AFTER having been signed using public-key of the CURRENT sender
            * The fact it is signed means we can validate the sender is legitimate
            * If the de-signed value of 'signedPublicKey' equals the value of 'publicKey' then we know the sender is allowed to send these coins
     */
    private String signedPublicKey; //Equivilant to sigScript in regular bitcoin implementation

    public OutPoint getPreviousOutPoint() {
        return previousOutPoint;
    }

    public void setPreviousOutPoint(OutPoint previousOutPoint) {
        this.previousOutPoint = previousOutPoint;
    }


}
