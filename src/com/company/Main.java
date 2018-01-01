package com.company;

import com.company.crypto.common.ECKeyPair;
import com.company.crypto.common.SHAUtil;

import java.io.UnsupportedEncodingException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    private static List<Block> blocks = new ArrayList<Block>();

    public static void main(String[] args) {

        System.out.println("Hello World");


        ECKeyPair ecKeyPair = ECKeyPair.createNew(false);

        try{

            String aydansWalletAddress = new String(ecKeyPair.getAddress().toByteArray(), "UTF-8");
            String thaisWalletAddress = new String(ecKeyPair.getAddress().toByteArray(), "UTF-8");

            //Public/Private ECDSA Key Pair
            System.out.println("Private Key: " + new String(ecKeyPair.getPrivate(), "UTF-8"));
            System.out.println("Public Key: " + new String(ecKeyPair.getPublic(), "UTF-8"));

            //Bitcoin address is a 160-bit hash of the public portion of a public/private ECDSA keypair
            System.out.println("Aydan's Bitcoin Address: " + aydansWalletAddress);
            System.out.println("Thai's Bitcoin Address: " + thaisWalletAddress);



            //Initial for genesis block
//            Transaction transaction = new Transaction();
            //transaction.getTransactionIns().clear(); Genesis block does not contain transaction inputs!
            
//            transaction.getTransactionOuts().add()

            //Create hash for genesis block
//            Block genesisBlock = new Block();
//            genesisBlock.set


//            String genesisBlockHash = SHAUtil.generateSHA256Hash("", "", LocalDateTime.now(), 1l);
//            System.out.println("Gnesis Block Hash: " + genesisBlockHash);

            blocks.add(mineBlock(aydansWalletAddress, new ArrayList<Transaction>()));



            blocks.add(mineBlock(thaisWalletAddress, new ArrayList<Transaction>()));


        } catch(Exception ex){
            System.err.println(ex.getMessage());
        }



        //



        // write your code here
    }

    private static Block mineBlock(String walletAddress, List<Transaction> transactions) {
        Block block = new Block();

        if (blocks.size() == 0) {
            // Create the genesis block
            //
            // See: https://sourceforge.net/p/bitcoin/code/133/tree/trunk/main.cpp#l1607

            block.setTransactions(createTransactions(walletAddress, transactions));

        } else {
            // Create a normal block

            block.setTransactions(createTransactions(walletAddress, transactions));

        }

        return block;
    }

    private static List<Transaction> createTransactions(String toAddress, List<Transaction> transactions) {
        Transaction transaction = new Transaction();
        transaction.setTransactionIns(createTransactionIns());
        transaction.setTransactionOuts(createTransactionOuts(toAddress));
        return Collections.singletonList(transaction);
    }

    private static List<TransactionIn> createTransactionIns() {
        List<TransactionIn> transactionIns = new ArrayList<TransactionIn>();
        transactionIns.add(createGenerationTransaction());
        return transactionIns;
    }

    private static TransactionIn createGenerationTransaction() {
        return new TransactionIn();
    }

    private static List<TransactionOut> createTransactionOuts(String toAddress) {
        return Collections.singletonList(new TransactionOut());
    }
}
