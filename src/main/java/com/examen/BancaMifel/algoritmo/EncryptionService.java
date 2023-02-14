package com.examen.BancaMifel.algoritmo;

import org.springframework.stereotype.Component;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import java.util.Base64;

@Component
public class EncryptionService {
    private SecretKey key;
    private IvParameterSpec iv;

    public EncryptionService() throws Exception {
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        keyGen.init(128);
        key = keyGen.generateKey();
        iv = new IvParameterSpec(new byte[16]);
    }

    public SecretKey getKey() {
        return key;
    }

    public IvParameterSpec getIv() {
        return iv;
    }

    public String encrypt(String data) throws Exception {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, key, iv);
        byte[] encryptedData  = cipher.doFinal(data.getBytes());
        return Base64.getEncoder().encodeToString(encryptedData);
    }

    public String decrypt(String encryptedData) throws Exception {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(Cipher.DECRYPT_MODE, key, iv);
        byte[] decodedData = Base64.getDecoder().decode(encryptedData);
        byte[] decryptedData = cipher.doFinal(decodedData);
        return new String(decryptedData);
    }
}