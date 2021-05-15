package sec01.exam05;

public class SmartPhoneExample {

	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("구글", "안드로이드");
		
		String strObj = myPhone.toString();
		String strObj2 = myPhone.whatIfTwo();
		System.out.println(strObj);
		System.out.println(strObj2);
		
		
		System.out.println(myPhone);
		/* System.out.println(객체)를 주게되면
		 * 객체에 toString()메소드를 호출해서 리턴값을 받아 출력하도록 되어있음. 
		 */
									
	}

}
