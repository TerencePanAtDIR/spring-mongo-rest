package com.example.terencepan.springsamples.springmongorest.utils;

import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;

import java.security.Security;
import java.util.Random;

public class SampleUtils {
    public static String randomString(int length){

        int leftLimit = 64; // char '@'
        int rightLimit = 122; // char 'z'
        int targetStringLength = length;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }

        return buffer.toString();
    }

    public static String encryptString(String stringToEncrypt){

        Security.addProvider(new BouncyCastleProvider());

        StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
        encryptor.setProviderName("BC");
        //TODO: Set with system properties
        encryptor.setPassword("EncryptedPassword");
        encryptor.setAlgorithm("PBEWITHSHA-256AND256BITAES-CBC-BC");

        return encryptor.encrypt(stringToEncrypt);
    }

    public static String decryptString(String stringToDecrypt){

        Security.addProvider(new BouncyCastleProvider());

        StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
        encryptor.setProviderName("BC");
        //TODO: Set with system properties
        encryptor.setPassword("EncryptedPassword");
        encryptor.setAlgorithm("PBEWITHSHA-256AND256BITAES-CBC-BC");
        return encryptor.decrypt(stringToDecrypt);
    }
}
