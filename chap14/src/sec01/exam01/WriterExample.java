package sec01.exam01;

import java.io.*;
import java.io.FileOutputStream;

public class WriterExample {

	public static void main(String[] args) throws Exception{
		OutputStream os = new FileOutputStream("C:/Temp/test1.db");
		
		byte a = 10;
		byte b = 20;
		byte c = 30;
		
		os.write(a);
		os.write(b);
		os.write(c);
		
		os.flush();
		os.close();
	}

}
