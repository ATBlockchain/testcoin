package com.company.crypto.common;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDateTime;

public class SHAUtil {

    public static String generateSHA256Hash(String prevBlock, String merkleRoot, LocalDateTime timestamp, Long nounce) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        String combined = prevBlock + merkleRoot + timestamp.toString() + nounce;
        //MessageDigest digest = MessageDigest.getInstance("SHA-256");
        //return digest.digest(new String(combined.getBytes(), "UTF-8")));
        return org.apache.commons.codec.digest.DigestUtils.sha256Hex(combined);
    }

}
