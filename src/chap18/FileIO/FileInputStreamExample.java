package chap18.FileIO;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {
	public static void main(String[] args){
		try{
			FileInputStream fis = new FileInputStream("src/chap18/FileIO/FileInputStreamExample.java");
			int data;
			while((data = fis.read())!=-1){
				System.out.write(data);
			}
			fis.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
