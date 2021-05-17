package sec02.example;

import java.io.*;

public class AddLineNumberExample {

	public static void main(String[] args) throws Exception{
		String filePath = "src/sec02/example/AddLineNumberExample.java";
		Reader reader = new FileReader(filePath);
		BufferedReader br = new BufferedReader(reader);
		int rownum = 0;
		
		while(true) {
			String str = br.readLine();
			if (str == null) break;
			System.out.println(++rownum + ":" + str);
		}
		
		br.close();
	}

}
