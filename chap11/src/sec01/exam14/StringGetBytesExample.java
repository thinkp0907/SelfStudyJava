package sec01.exam14;

import java.io.*;

public class StringGetBytesExample {

	public static void main(String[] args) {
		String str = "안녕하세요";
		
		byte[] bytes1 = str.getBytes();								// 기본 문자셋으로 인코딩 
		System.out.println("byets1.length: " + bytes1.length );		// 기본 문자셋으로 인코딩 했을 때 length = 10
		String str1 = new String(bytes1);							
		System.out.println("bytes1-> String: " + str1);
		
		
		try {
			byte[] bytes2 = str.getBytes("EUC-KR");					// EUR-KR 문자셋으로 인코딩
			System.out.println("bytes2.length: " + bytes2.length);	// EUR-KR 문자셋으로 인코딩 했을 때 length = 10
			String str2 = new String(bytes2, "EUC-KR");				// EUR-KR 문자셋은 영어 1byte, 한글 2byte
			System.out.println("bytes2-> String: " + str2);
			
			byte[] bytes3 = str.getBytes("UTF-8");					// UTF-KR 문자셋으로 인코딩
			System.out.println("bytes3.length: " + bytes3.length);	// UTF-KR 문자셋으로 인코딩 했을 때 length = 15
			String str3 = new String(bytes3, "UTF-8");				// UTF-KR 문자셋은 영어 1byte, 한글 3byte
			System.out.println("bytes3-> String: " + str3);
		} catch (UnsupportedEncodingException e ) {
			e.printStackTrace();
		}
	}

}
