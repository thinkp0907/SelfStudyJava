package sec01.example;

import java.util.*;
import java.util.Map.*;

public class MapExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;		// �ְ� ������ ���� ���̵�����
		int maxScore = 0;		// �ְ� ���� ����
		int totalScore = 0;		// ���� �հ� ����
		
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
			
			System.out.println("�������: " + avgScore);
			System.out.println("�ְ�����: " + maxScore);
			System.out.println("�ְ������� ���� ���̵�: " + name);
		
		
//		for(Map.Entry<String, Integer> entry : entrySet) {
//			if(entry.getValue() > maxScore) {
//				name = entry.getKey();
//				maxScore = entry.getValue();
//			}
//			totalScore += entry.getValue();
//		}
//		
//		int avgScore = totalScore / map.size();
//		System.out.println("�������: " + avgScore);
//		
//		System.out.println("�ְ�����: " + maxScore);
//		System.out.println("�ְ������� ���� ���̵�: " + name);
	}

}
