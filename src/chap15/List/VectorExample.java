package chap15.List;

import java.util.List;
import java.util.Vector;

public class VectorExample {
	public static void main(String[] args){
		List<Board> list = new Vector<Board>();
		
		list.add(new Board("subject1", "content1", "writer1"));
		list.add(new Board("subject2", "content2", "writer2"));
		list.add(new Board("subject3", "content3", "writer3"));
		list.add(new Board("subject4", "content4", "writer4"));
		list.add(new Board("subject5", "content5", "writer5"));
		
		list.remove(2);
		list.remove(3);
		
		for(int i=0;i<list.size();i++){
			Board board = list.get(i);
			System.out.println(board.subject+"\t"+board.content+"\t"+board.writer);
		}
		
	}
}
