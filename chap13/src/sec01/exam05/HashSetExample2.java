package sec01.exam05;

import java.util.*;

public class HashSetExample2 {
	
	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("ȫ�浿", 30));				// ���� �ٸ� �ν��Ͻ������� 
		set.add(new Member("ȫ�浿", 30));				// ���ε����Ͱ� �����ϹǷ� ��ü 1���� ����
		
		
		System.out.println("�� ��ü��: " + set.size());
	}
}
