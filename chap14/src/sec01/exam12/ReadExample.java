package sec01.exam12;

import java.io.*;

public class ReadExample {

	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("C:/Temp/test8.txt");
		
		char[] array = new char[100];
		
		
		while(true) {
			int data = reader.read(array);
			if(data == -1) break;
			for(int i=0; i<data; i++) {
				System.out.println(array[i]);
			}
		}
		reader.close();
		
		
		
	}

}
