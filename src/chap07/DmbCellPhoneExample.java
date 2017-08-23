package chap07;

public class DmbCellPhoneExample {
	public static void main(String[] args){
		DmbCellPhone dmbCellPhone = new DmbCellPhone("java", "black", 10);
		
		System.out.println("model : "+dmbCellPhone.model);
		System.out.println("color : "+dmbCellPhone.color);
		
		System.out.println("channel : "+dmbCellPhone.channel);
		
		dmbCellPhone.PowerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("hi");
		dmbCellPhone.receiveVoice("nice to meet you");
		dmbCellPhone.sendVoice("me too");
		dmbCellPhone.hangUp();
		
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(11);
		dmbCellPhone.turnOffDmb();
	}
}
