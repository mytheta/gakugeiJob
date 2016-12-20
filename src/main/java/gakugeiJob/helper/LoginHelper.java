package gakugeiJob.helper;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class LoginHelper{
	private static final String HASH_ALGORITHM = "SHA-256";
	private static final int STRETCH_COUNT = 1024;
	private static final String FIXED_SALT = "3a0d8e7e3b8c2d7b5a3f5d1a0c3b2a56";

	public static String getHash(String name, String password) throws NoSuchAlgorithmException{
		MessageDigest messageDigest = MessageDigest.getInstance(HASH_ALGORITHM);
		String salt = name + FIXED_SALT;
		messageDigest.update(salt.getBytes());
		byte[] hashed = messageDigest.digest(password.getBytes());

		for(int i = 0; i < STRETCH_COUNT; i++){
			hashed = messageDigest.digest(hashed);
		}
		return getHexString(hashed);
		}

	private static String getHexString(byte[] bytes){
		StringBuffer stringBuffer = new StringBuffer();
		for(int i = 0; i < bytes.length; i++){
			stringBuffer.append(Integer.toHexString((bytes[i] >> 4) & 0x0f));
			stringBuffer.append(Integer.toHexString(bytes[i] & 0x0f));
		}
		return stringBuffer.toString();
	}
}
