package sec01.exam11;

import java.io.*;

public class KeyboardToStringExample {

	public static void main(String[] args) throws IOException {
		byte[] bytes = new byte[100];
		
		System.out.print("�Է�: ");
		int readByteNo = System.in.read(bytes);
		for(int i=0; i<7; i++)  {
			System.out.printf("%d \t ", bytes[i]);
		}
		System.out.println();
		String str = new String(bytes, 0, readByteNo-2);
		System.out.println(str);
	}

}
