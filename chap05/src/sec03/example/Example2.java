package sec03.example;

import sec03.exam01.LoginResult;

public class Example2 {

	public static void main(String[] args) {
		LoginResult result = LoginResult.FAIL_PASSWROD;
		
		if (result == LoginResult.SUCCESS ) {
			System.out.println("�α��� �Ϸ�!");
		} else if(result == LoginResult.FAIL_ID) {
			System.out.println("���̵� Ȯ���ϼ���!");
		} else if(result == LoginResult.FAIL_PASSWROD) {
			System.out.println("��й�ȣ�� Ȯ���ϼ���!");
		}
	}

}
