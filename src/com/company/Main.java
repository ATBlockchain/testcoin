package com.company;

import com.company.crypto.common.ECKeyPair;

import java.io.UnsupportedEncodingException;

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


        } catch(UnsupportedEncodingException ex){
            System.err.println(ex.getMessage());
        }



        // write your code here
    }
}
