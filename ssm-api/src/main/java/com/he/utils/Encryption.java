package com.he.utils;

import lombok.extern.slf4j.Slf4j;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import javax.crypto.*;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

@Slf4j
public class Encryption {

    private static final String ENCRYPTION_CONFIG_STRING = "AES/CBC/PKCS5Padding";
    private static final String ENCRYPTION_CONFIG_CHARSET = "utf-8";
    private static final String ENCRYPTION_CONFIG_TYPE = "AES";

    static Encryption instance = null;

    /**
     * 获取当前Secret KEY值
     * @param version
     * @param appid
     * @return
     */
    public static String getSecretKey(String version, Integer appid) {
        return "1234567890123456";
    }

    public static Encryption getInstance() {
        if (instance == null) {
            instance = new Encryption();
        }
        return instance;
    }

    /**
     * 获取加密IV
     * @param version
     * @param appid
     * @return
     */
    public static String getIv(String version, Integer appid) {
        return "9876543210012345";
    }

    /**
     * 加密数据
     * @param data
     * @return
     */
    public String encryption(String data, String version, Integer appid) throws Exception {

        Cipher cipher = Cipher.getInstance(Encryption.ENCRYPTION_CONFIG_STRING);

        byte[] raw = Encryption.getSecretKey(version, appid).getBytes();

        SecretKeySpec secretKeySpec = new SecretKeySpec(raw, Encryption.ENCRYPTION_CONFIG_TYPE);

        IvParameterSpec ivParameterSpec = new IvParameterSpec(Encryption.getIv(version, appid).getBytes());

        cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec, ivParameterSpec);

        byte[] encryptionData = cipher.doFinal(data.getBytes(Encryption.ENCRYPTION_CONFIG_CHARSET));

//        return Encryption.getInstance().enBase64ToString(encryptionData);

        return new BASE64Encoder().encode(encryptionData);

    }

    public String decryption(String data, String version, Integer appid) throws Exception {
        byte[] raw = Encryption.getSecretKey(version, appid).getBytes("ASCII");
        SecretKeySpec secretKeySpec = new SecretKeySpec(raw, Encryption.ENCRYPTION_CONFIG_TYPE);
        Cipher cipher = Cipher.getInstance(Encryption.ENCRYPTION_CONFIG_STRING);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(Encryption.getIv(version, appid).getBytes());
        cipher.init(Cipher.DECRYPT_MODE, secretKeySpec, ivParameterSpec);

//        byte[] rawData = Encryption.getInstance().deBase64ToString(data).getBytes();
        byte[] rawData = new BASE64Decoder().decodeBuffer(data);

        byte[] rawEncryption = cipher.doFinal(rawData);

        return (new String(rawEncryption, Encryption.ENCRYPTION_CONFIG_CHARSET));
    }

    /**
     * 加密base64
     * @param data
     * @return
     */
    public String enBase64ToString(byte[] data) {
        Base64.Encoder encoder = Base64.getEncoder();
        return encoder.encode(data).toString();
    }

    /**
     * 解密base64字符串
     * @param data
     * @return
     */
    public String deBase64ToString(String data) {
        Base64.Decoder decoder = Base64.getDecoder();
        return decoder.decode(data).toString();
    }

    public static void main(String[] args) {
        try {
            String enData = Encryption.getInstance().encryption("1234567890", "1.0.1", 1);
            log.info("endata: {}", enData);

            String deData = Encryption.getInstance().decryption(enData, "1.0.1", 1);
            log.info("dedata: {}", deData);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
