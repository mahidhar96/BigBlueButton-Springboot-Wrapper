package com.bbb.wrapper.utils;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.apache.commons.codec.digest.DigestUtils;

public class WrapperUtils {
	
	public static String generateSHA1(String callName,String queryString,String sharedSecret) 
	{
		String input;
		if(queryString!=null && queryString.length()>0) {
			input = callName.concat(queryString.substring(0,queryString.length()-1)).concat(sharedSecret);
		}else {
			input = callName.concat(sharedSecret);
		}
		String hashtext = DigestUtils.sha1Hex(input);
		return hashtext;
//		try {
//			MessageDigest md = MessageDigest.getInstance("SHA-1"); 
//			byte[] messageDigest = md.digest(input.getBytes()); 
//			BigInteger no = new BigInteger(1, messageDigest); 
//			hashtext = no.toString(16); 
//			while (hashtext.length() < 40) { 
//				hashtext = "0".concat(hashtext); 
//			} 
//			return hashtext; 
//		} 
//		catch (NoSuchAlgorithmException e) { 
//			throw new RuntimeException(e); 
//		} 
	}
	
	public static String joinQuery(String query, String attribute, String value) throws UnsupportedEncodingException {
		query = query.concat(attribute).concat("=").concat(URLEncoder.encode(value,"UTF-8")).concat("&");
		return query;
	}
	
	public static String finalQuery(String callName,String queryString,String checksum) {
		return callName.concat("?").concat(queryString).concat("checksum=").concat(checksum);
	}
	
}
