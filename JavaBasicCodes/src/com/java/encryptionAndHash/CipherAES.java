package com.java.encryptionAndHash;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

public class CipherAES {
	private static String UNIQUE_KEY = "U25hcGRlYWxVbmlxdWVLZXk=";
	public static final String ALGORITHM_TYPE = "AES";
	private static Cipher encryptCipher;
	private static Cipher decryptCipher;
	static {
		try {
			Key secretKey = buildAESKey(UNIQUE_KEY,ALGORITHM_TYPE);
			encryptCipher = Cipher.getInstance(secretKey.getAlgorithm());
			decryptCipher = Cipher.getInstance(secretKey.getAlgorithm());
			encryptCipher.init(Cipher.ENCRYPT_MODE, secretKey);
			decryptCipher.init(Cipher.DECRYPT_MODE, secretKey);
		} catch (NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException | UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	private static Key buildAESKey(String uNIQUE_KEY2, String algorithmType) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		md.reset();
		md.update(uNIQUE_KEY2.getBytes("UTF-8"));
		byte[] b = md.digest();
		SecretKeySpec key = new SecretKeySpec(b, 0,16,algorithmType);
		// TODO Auto-generated method stub
		return key;
	}
	private static String ecrypt(String plainText) {
		byte[] text  = plainText.getBytes();
		byte[] encrypted = null;
		byte[] encoded = null;
		
		try {
			encrypted = encryptCipher.doFinal(text);
			encoded = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(encrypted);
		} catch (IllegalBlockSizeException | BadPaddingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new String(encoded);
		
	}
	/**
	 * here we using apache commons because its convert our string into multiple of 16 bytes
	 * Input length must be multiple of 16 when decrypting with padded cipher
	 * @param cipher
	 * @return
	 */
	private static String decrypt(String cipher) {
		byte[]  decoded = org.apache.commons.codec.binary.Base64.decodeBase64(cipher);
		byte[] decrypted = null;
		
		try {
			decrypted = decryptCipher.doFinal(decoded);
		} catch (IllegalBlockSizeException | BadPaddingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new String(decrypted);
	}
	
	public static void main(String[] args) {
		String message = "Hi world";
		String encrypted = ecrypt(message);
		System.out.println(encrypted);
		String decrypted = decrypt(encrypted);
		System.out.println(decrypted);
	}
	

}
