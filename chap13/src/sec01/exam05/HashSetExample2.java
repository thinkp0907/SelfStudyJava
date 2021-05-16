package sec01.exam05;

import java.util.*;

public class HashSetExample2 {
	
	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("홍길동", 30));				// 서로 다른 인스턴스이지만 
		set.add(new Member("홍길동", 30));				// 내부데이터가 동일하므로 객체 1개만 저장
		
		
		System.out.println("총 객체수: " + set.size());
	}
}
