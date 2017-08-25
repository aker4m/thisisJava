package chap12.Thread;

import java.awt.Toolkit;

public class BeepTask3 {
	Thread thread = new Thread(()->{
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0;i<5;i++){
			toolkit.beep();
			try{
				Thread.sleep(500);
			}catch(Exception e){}
		}
	});
}
