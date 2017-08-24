package chap11.System;

import java.util.Properties;
import java.util.Set;

public class GetPropertyExample {
	public static void main(String[] args){
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userHome = System.getProperty("user.home");
		
		System.out.println("osName : "+osName);
		System.out.println("userName : "+userName);
		System.out.println("userHome : "+userHome);
		
		System.out.println("--------------------------------");
		System.out.println(" [ key ] value ");
		System.out.println("--------------------------------");
		
		Properties props = System.getProperties();
		Set keys = props.keySet();
		for(Object objkey : keys){
			String key = (String)objkey;
			String value = System.getProperty(key);
			System.out.println("[ "+key+" ] "+value);
		}
	}
}
