package sec01.exam14;

import java.io.*;

public class StringGetBytesExample {

	public static void main(String[] args) {
		String str = "�ȳ��ϼ���";
		
		byte[] bytes1 = str.getBytes();								// �⺻ ���ڼ����� ���ڵ� 
		System.out.println("byets1.length: " + bytes1.length );		// �⺻ ���ڼ����� ���ڵ� ���� �� length = 10
		String str1 = new String(bytes1);							
		System.out.println("bytes1-> String: " + str1);
		
		
		try {
			byte[] bytes2 = str.getBytes("EUC-KR");					// EUR-KR ���ڼ����� ���ڵ�
			System.out.println("bytes2.length: " + bytes2.length);	// EUR-KR ���ڼ����� ���ڵ� ���� �� length = 10
			String str2 = new String(bytes2, "EUC-KR");				// EUR-KR ���ڼ��� ���� 1byte, �ѱ� 2byte
			System.out.println("bytes2-> String: " + str2);
			
			byte[] bytes3 = str.getBytes("UTF-8");					// UTF-KR ���ڼ����� ���ڵ�
			System.out.println("bytes3.length: " + bytes3.length);	// UTF-KR ���ڼ����� ���ڵ� ���� �� length = 15
			String str3 = new String(bytes3, "UTF-8");				// UTF-KR ���ڼ��� ���� 1byte, �ѱ� 3byte
			System.out.println("bytes3-> String: " + str3);
		} catch (UnsupportedEncodingException e ) {
			e.printStackTrace();
		}
	}

}
