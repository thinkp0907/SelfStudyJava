package sec01.example;

import java.util.*;

public class BoardDao {	
	public List<Board> getBoardList1() {
		Board board1 = new Board("����1", "����1");
		Board board2 = new Board("����2", "����2");
		Board board3 = new Board("����3", "����3");
		
		List<Board> list1 = new ArrayList<Board>();
		list1.add(board1);
		list1.add(board2);
		list1.add(board3);
		
		return list1;
		
	}
	
	public List<Board> getBoardList2() {
		List<Board> list = new ArrayList<Board>();
		
		list.add(new Board("����1", "����1"));
		list.add(new Board("����2", "����2"));
		list.add(new Board("����3", "����3"));
		
		return list;
	}
}
