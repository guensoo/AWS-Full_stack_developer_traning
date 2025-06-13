package ex01_innerClass;

class Car{
	private String engineType = "V6";
	
	
	// 차에 시동을 건다(기능)
	void startEngine() {
		System.out.println(engineType+"엔진 시동 거는 중");
	}
}

// 엔진 객체는 상태가 있는 구성요소로 존재하게 된다.
// 엔진이라는 객체를 캡슐화 할 수 있다.
class Engine{
	void start() {
		System.out.println(engineType+"엔진이 시동됨");
	}
	
	void stop() {
		System.out.println("엔진이 꺼짐");
	}
}

public class CarExample {
	public static void main(String[] args) {
//		Car c = new Car();
//		c.startEngine();
		
		Car c = new Car();
		Car.Engine engine = c.new Engine();
		engine.start();
		engine.stop();
		
		// 왜 굳이 내부클래스로 정의할까??
		// 1. 외부클래스의 내부 구성요소를 객체 단위로 표현하고 싶을 때
		// ex) 자동차의 부품인 엔진(engine), 브레이크(brake)등
		// 2. 해당 클래스가 외부 클래스 없이는 절대 존재할 수 없을 때
		// Engine은 자동차 없이는 존재할 수 없음 -> 내부클래스로 만들면 논리적으로 자연스러움
		// 3. 상태와 기능을 하나의 단위로 묶고 싶을 때
		// - 메서드는 상태를 가지지 못하지만, 클래스는 가질 수 있다.
	}
}
