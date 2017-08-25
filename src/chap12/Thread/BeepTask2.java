package chap12.Thread;

import java.awt.Toolkit;

public class BeepTask2 {
	Thread thread = new Thread(new Runnable(){

		@Override
		public void run() {
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for(int i=0;i<5;i++){
				toolkit.beep();
				try{
					thread.sleep(500);
				}catch(Exception e){}
			}
		}
		
	});
}
