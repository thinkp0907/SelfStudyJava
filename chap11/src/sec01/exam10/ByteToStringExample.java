package sec01.exam10;

public class ByteToStringExample {

	public static void main(String[] args) {
		byte[] bytes = {72,101,108,108,111,32,74,97,118,97};
		
		String str1 = new String(bytes);
		
		System.out.println(str1);
		
		String str2 = new String(bytes, 6, 4);
		// String str2 = new String(byte[] bytes, int offset, int length);
		//  -> byte[] bytes�迭�� offset�ε��� ��ġ���� length��ŭ String ��ü�� ����
		
		System.out.println(str2);
		
		

	}

}
