package com.snr.sample;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class PasswordService {
	
	int x = 10;
	int y = 12;
	
	public static String encoded(String text) {
		Encoder encoder = Base64.getEncoder();
		return encoder.encodeToString(text.getBytes());
	}
	
	public static String decoded(String encodeText) {
		Decoder decorder = Base64.getDecoder();
		byte[] decoder = decorder.decode(encodeText);
		return new String(decoder);
	}

}
