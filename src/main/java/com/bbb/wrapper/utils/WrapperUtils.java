package com.bbb.wrapper.utils;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class WrapperUtils {
	
	public static String generateSHA1(String callName,String queryString,String sharedSecret) 
	{ 
		String input = callName.concat(queryString.substring(0,queryString.length()-1)).concat(sharedSecret);
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-1"); 
			byte[] messageDigest = md.digest(input.getBytes()); 
			BigInteger no = new BigInteger(1, messageDigest); 
			String hashtext = no.toString(16); 
			while (hashtext.length() < 32) { 
				hashtext = "0" + hashtext; 
			} 
			return hashtext; 
		} 
		catch (NoSuchAlgorithmException e) { 
			throw new RuntimeException(e); 
		} 
	}
	
	public static String joinQuery(String query, String attribute, String value) throws UnsupportedEncodingException {
		query = query.concat(attribute).concat("=").concat(URLEncoder.encode(value,"UTF-8")).concat("&");
		return query;
	}
	
	public static String finalQuery(String callName,String queryString,String checksum) {
		return callName.concat("?").concat(queryString).concat("checksum=").concat(checksum);
	}
	
}
