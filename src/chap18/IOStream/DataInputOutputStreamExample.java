package chap18.IOStream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;

public class DataInputOutputStreamExample {
	public static void main(String[] args) throws Exception{
		FileOutputStream fos = new FileOutputStream("src/chap18/IOStream/primitive.dat");
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeUTF("hong");
		dos.writeDouble(95.5);
		dos.writeInt(1);
		
		dos.writeUTF("kim");
		dos.writeDouble(90.3);
		dos.writeInt(2);
		
		dos.flush(); dos.close(); fos.close();
		
		FileInputStream fis = new FileInputStream("src/chap18/IOStream/primitive.dat");
		DataInputStream dis = new DataInputStream(fis);
		
		for(int i=0;i<2;i++){
			String name = dis.readUTF();
			double score = dis.readDouble();
			int order = dis.readInt();
			System.out.println(name+" : "+score +" : "+order);
		}
		dis.close(); fis.close();
	}
}
