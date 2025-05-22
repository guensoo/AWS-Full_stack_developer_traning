package ex02_constructor;

public class PhoneMain {
	public static void main(String[] args) {
		Phone p1 = new Phone("갤럭시",1,"흰색");
		p1.PhoneInfo();
		// Phone p2 = new Phone("아이폰",16,"검정색");
		
		// 검정색이 기본값이더라도 매개변수를 입력해야하기 때문에 "검정색"을 다시 작성해야한다.
		// 그렇다고 매개변수의 색깔을 빼게 되면 "갤럭시"의 색이 검정색으로 설정된다.
		Phone p2 = new Phone("아이폰", 16);
		p2.PhoneInfo();
	}
}
