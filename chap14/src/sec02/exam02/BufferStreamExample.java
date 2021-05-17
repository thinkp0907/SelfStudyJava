package sec02.exam02;

import java.io.*;

public class BufferStreamExample {

	public static void main(String[] args) throws Exception{
		String originalFilePath = 
				BufferStreamExample.class.getResource("originalFile1.jpg").getPath();
		String targetFilePath1 = "C:/Temp/targetFile1.jpg";
		FileInputStream fis = new FileInputStream(originalFilePath);
		FileOutputStream fos = new FileOutputStream(targetFilePath1);

		String originalFilePath2 = 
				BufferStreamExample.class.getResource("originalFile1.jpg").getPath();
		String targetFilePath2 = "C:/Temp/targetFile2.jpg";
		FileInputStream fis2 = new FileInputStream(originalFilePath2);
		FileOutputStream fos2 = new FileOutputStream(targetFilePath2);
		BufferedInputStream bis = new BufferedInputStream(fis2);
		BufferedOutputStream bos = new BufferedOutputStream(fos2);
		
		long nonBufferTime = copy(fis, fos);
		System.out.println("���۸� ������� �ʾ��� ��:\t" + nonBufferTime + "ns");
		
		long bufferTime = copy(fis2, fos2);
		System.out.println("���۸� ������� ��:\t" + bufferTime + "ns");
		
		fis.close();
		fos.close();
		bis.close();
		bos.close();
	}
	
	static int data = -1;
	public static long copy(InputStream is, OutputStream os) throws Exception{
		long start = System.nanoTime();
		while(true) {
			data = is.read();
			if(data != -1) {
				os.write(data);
			}
			break;
		}
		os.flush();
		long end = System.nanoTime();
		return (end-start);
	}

}
