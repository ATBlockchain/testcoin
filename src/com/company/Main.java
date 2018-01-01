package com.company;

import com.company.crypto.common.ECKeyPair;
import com.company.crypto.common.SHAUtil;

import java.io.UnsupportedEncodingException;
import java.time.LocalDateTime;

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



        //



        // write your code here
    }
}
