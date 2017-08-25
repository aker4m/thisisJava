package chap12.StateControl;

public class ProducerThread extends Thread{
	private DataBox dataBox;
	
	public ProducerThread(DataBox dataBox){
		this.dataBox = dataBox;
	}
	
	@Override
	public void run(){
		for(int i=1;i<=3;i++){
			String data = "Ddata-"+i;
			dataBox.setData(data);
		}
	}
}
