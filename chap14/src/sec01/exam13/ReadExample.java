package sec01.exam13;

import java.io.*;

public class ReadExample {

	public static void main(String[] args) throws Exception{
		Reader reader = new FileReader("C:/Temp/test9.txt");
		
		
		char[] array = new char[5];
		
		while(true) {
			int data = reader.read(array, 2, 3);
			if (data == -1) break;
			for(int i=0; i<array.length; i++) {
				System.out.println(array[i]);
			}
		}
		reader.close();
	}

}
