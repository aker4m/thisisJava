package chap15.Exercise;

import java.util.LinkedList;
import java.util.List;

public class BoardDao {
	List<Board> list;
	
	public BoardDao(){
		list = new LinkedList<Board>();
		list.add(new Board("title1", "content1"));
		list.add(new Board("title2", "content2"));
		list.add(new Board("title3", "content3"));
	}
	
	public List<Board> getBoardList(){
		return list;
	}
	
}
