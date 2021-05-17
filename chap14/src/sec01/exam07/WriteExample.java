package sec01.exam07;

import java.io.*;

public class WriteExample {

	public static void main(String[] args) throws Exception{
		Writer writer = new FileWriter("C:/Temp/test7.txt");
		
		char a = 'A';
		char b = 'B';
		char c = 'C';
		
		writer.write(a);			// buffer
		writer.write(b);			// buffer
		writer.write(c);			// buffer
		
		writer.flush();				// buffer에 있는 것들 출력
		writer.close();
	}

}
