package com.company;

import com.company.crypto.common.ECKeyPair;
import com.company.crypto.common.SHAUtil;

import java.io.UnsupportedEncodingException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World");


        ECKeyPair ecKeyPair = ECKeyPair.createNew(false);

        try{

            //Public/Private ECDSA Key Pair
            System.out.println("Private Key: " + new String(ecKeyPair.getPrivate(), "UTF-8"));
            System.out.println("Public Key: " + new String(ecKeyPair.getPublic(), "UTF-8"));

            //Bitcoin address is a 160-bit hash of the public portion of a public/private ECDSA keypair
            System.out.println("Bitcoin Address: " + new String(ecKeyPair.getAddress().toByteArray(), "UTF-8"));



            //Initial for genesis block
            Transaction transaction = new Transaction();
            //transaction.getTransactionIns().clear(); Genesis block does not contain transaction inputs!
            
            transaction.getTransactionOuts().add()

            //Create hash for genesis block
            Block genesisBlock = new Block();
            genesisBlock.set


            String genesisBlockHash = SHAUtil.generateSHA256Hash("", "", LocalDateTime.now(), 1l);
            System.out.println("Gnesis Block Hash: " + genesisBlockHash);

        } catch(Exception ex){
            System.err.println(ex.getMessage());
        }

        List<Block> blocks = new ArrayList<Block>();
        blocks.add(mineBlock(blocks));
        blocks.add(mineBlock(blocks));

        //



        // write your code here
    }

    private static Block mineBlock(List<Block> blocks) {
        if (blocks.size() == 0) {
            Block block = new Block();
            block.setTransactions(createTransactions());
        }
        return new Block();
    }

    private static List<Transaction> createTransactions() {
        Transaction transaction = new Transaction();
        transaction.setTransactionIns(createTransactionIns());
        transaction.setTransactionOuts(createTransactionOuts());
        return Collections.singletonList(transaction);
    }

    private static List<TransactionIn> createTransactionIns() {
        return Collections.singletonList(new TransactionIn());
    }

    private static List<TransactionOut> createTransactionOuts() {
        return Collections.singletonList(new TransactionOut());
    }
}
