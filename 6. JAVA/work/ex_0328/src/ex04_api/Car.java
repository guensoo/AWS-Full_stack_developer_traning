package ex04_api;

public class Car {
	private String carName;
	private String company;
	
	public Car(String carName, String company) {
		this.carName = carName;
		this.company = company;
	}
	
	// 모든 클래스는 Objecct를 상속받는다.
	@Override
	public String toString() {
		String str = "차량 이름 : " + this.carName + ", 제조사 : " + this.company;
		return str;
	}
}
