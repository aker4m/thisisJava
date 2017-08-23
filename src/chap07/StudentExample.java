package chap07;

public class StudentExample {
	public static void main(String[] args){
		Student student = new Student("kim", "123456-1234567", 001);
		
		System.out.println("name : "+student.name);
		System.out.println("ssn : "+student.ssn);
		System.out.println("studentNo : "+student.studentNo);
	}
}
