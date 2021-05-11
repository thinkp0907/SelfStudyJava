package sec03.example;

import sec03.exam01.LoginResult;

public class Example2 {

	public static void main(String[] args) {
		LoginResult result = LoginResult.FAIL_PASSWROD;
		
		if (result == LoginResult.SUCCESS ) {
			System.out.println("로그인 완료!");
		} else if(result == LoginResult.FAIL_ID) {
			System.out.println("아이디를 확인하세요!");
		} else if(result == LoginResult.FAIL_PASSWROD) {
			System.out.println("비밀번호를 확인하세요!");
		}
	}

}
