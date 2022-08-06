package com.snr.sample;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class PasswordService {

	public static String encoded(String text) {
		int i = 100;
		int j = 100;
		System.out.println("This Number value" + i);
		Encoder encoder = Base64.getEncoder();
		return encoder.encodeToString(text.getBytes());
	}
	
	public static String decoded(String encodeText) {
		String string = "nagaraju";
		String string2 = "abhi";
		String string3 = "ramanji";
		Decoder decorder = Base64.getDecoder();
		byte[] decoder = decorder.decode(encodeText);
		return new String(decoder);
	}

}
