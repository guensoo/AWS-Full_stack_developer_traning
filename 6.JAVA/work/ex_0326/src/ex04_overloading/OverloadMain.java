package ex04_overloading;

public class OverloadMain {
	public static void main(String[] args) {
		Overload ol = new Overload();
		
		// 같은 이름이지만 인자에 따라 다른 기능을 하는 메서드를 만들 수 있다.
		ol.result();
		ol.result(100);
		ol.result('b');
		ol.result("문자열", 522);
		ol.result(522, "문자열");
		
	}
}
