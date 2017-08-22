package chap06;

public class Television {
	static String company = "LG";
	static String model = "LCD";
	static String info;
	
	static {
		info = company+"-"+model;
	}
}
