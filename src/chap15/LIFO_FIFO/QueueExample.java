package chap15.LIFO_FIFO;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args){
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		messageQueue.offer(new Message("sendMail", "hong"));
		messageQueue.offer(new Message("sendSMS", "shin"));
		messageQueue.offer(new Message("sendKakaotalk", "hong"));
		
		while(!messageQueue.isEmpty()){
			Message message = messageQueue.poll();
			switch(message.command){
			case "sendMail":
				System.out.println(message.to+"님에게 메일을 보냅니다.");
				break;
			case "sendSMS":
				System.out.println(message.to+"님에게 SMS를 보냅니다.");
				break;
			case "sendKakaotalk":
				System.out.println(message.to+"님에게 카카오톡을 보냅니다.");
				break;
			}
		}
	}
}
