package sec01.exam05;

public class SmartPhoneExample {

	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("����", "�ȵ���̵�");
		
		String strObj = myPhone.toString();
		String strObj2 = myPhone.whatIfTwo();
		System.out.println(strObj);
		System.out.println(strObj2);
		
		
		System.out.println(myPhone);
		/* System.out.println(��ü)�� �ְԵǸ�
		 * ��ü�� toString()�޼ҵ带 ȣ���ؼ� ���ϰ��� �޾� ����ϵ��� �Ǿ�����. 
		 */
									
	}

}
