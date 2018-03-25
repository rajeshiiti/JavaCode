package com.java.encryptionAndHash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Hashing {
	/**
	 * In MessageDigest we can pass parameter of 
	 * algorithms types are 
	 * MD5,SHA-1, SHA-256
	 * @param plainText
	 * @return
	 */
	public static String md5(String plainText) throws NoSuchAlgorithmException{
		MessageDigest md = MessageDigest.getInstance("MD5");
		md.update(plainText.getBytes());
		byte[] b = md.digest(plainText.getBytes());
		StringBuffer sb = new StringBuffer();
		for(byte b1: b) {
			sb.append(Integer.toHexString(b1 & 0xff).toString());
		}
		return sb.toString();
		
	}
	public static String sha256(String plainText) throws NoSuchAlgorithmException{
		MessageDigest sha = MessageDigest.getInstance("SHA-256");
		sha.update(plainText.getBytes());
		byte[] b = sha.digest(plainText.getBytes());
		System.out.println(b.length);
		StringBuffer sb = new StringBuffer();
		for(byte b1: b) {
			sb.append(Integer.toHexString(b1 & 0xff).toString());
		}
		return sb.toString();
		
	}
	public static String sha512(String plainText) throws NoSuchAlgorithmException{
		MessageDigest sha = MessageDigest.getInstance("SHA-512");
		sha.update(plainText.getBytes());
		byte[] b = sha.digest(plainText.getBytes());
		System.out.println(b.length);
		StringBuffer sb = new StringBuffer();
		for(byte b1: b) {
			sb.append(Integer.toHexString(b1 & 0xff).toString());
		}
		return sb.toString();
		
	}
	public static String sha1(String plainText) throws NoSuchAlgorithmException{
		MessageDigest sha = MessageDigest.getInstance("SHA-1");
		sha.update(plainText.getBytes());
		byte[] b = sha.digest(plainText.getBytes());
		System.out.println(b.length);
		StringBuffer sb = new StringBuffer();
		for(byte b1: b) {
			sb.append(Integer.toHexString(b1 & 0xff).toString());
		}
		return sb.toString();
		
	}
	public static void main(String[] args) throws NoSuchAlgorithmException {
		String p1 = "password";
		String p2 = "password";
		System.out.println(md5(p1));
		System.out.println(md5(p2));
		System.out.println(sha256(p1));
		System.out.println(sha256(p2));
	}

}
