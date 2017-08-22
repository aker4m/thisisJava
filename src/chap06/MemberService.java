package chap06;

public class MemberService {
	private String id="hong";
	private String password="12345";
	
	public boolean login(String id, String password){
		if(this.id == id && this.password == password){
			return true;
		}
		return false;
	}
	public void logout(String id){
		if(this.id == id){
			System.out.println("로그아웃 되었습니다");
		}
	}
}
