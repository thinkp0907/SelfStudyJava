package sec01.example;

import java.util.*;
import java.util.Map.*;

public class MapExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;		// 최고 점수를 받은 아이디저장
		int maxScore = 0;		// 최고 점수 저장
		int totalScore = 0;		// 점수 합계 저장
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		for(int i=0; i<map.size(); i++) {
			if (entryIterator.hasNext()) {
				Map.Entry<String, Integer> entry = entryIterator.next();
				if(entry.getValue() > maxScore) {
					name = entry.getKey();
					maxScore = entry.getValue();
				}
				totalScore += entry.getValue();
				}
		}
		
			int avgScore = totalScore / map.size();
			
			System.out.println("평균점수: " + avgScore);
			System.out.println("최고점수: " + maxScore);
			System.out.println("최고점수를 받은 아이디: " + name);
		
		
//		for(Map.Entry<String, Integer> entry : entrySet) {
//			if(entry.getValue() > maxScore) {
//				name = entry.getKey();
//				maxScore = entry.getValue();
//			}
//			totalScore += entry.getValue();
//		}
//		
//		int avgScore = totalScore / map.size();
//		System.out.println("평균점수: " + avgScore);
//		
//		System.out.println("최고점수: " + maxScore);
//		System.out.println("최고점수를 받은 아이디: " + name);
	}

}
