package ex02_class_casting;

class Car{};

class Bus extends Car{}; // Car -> Bus
class SchoolBus extends Bus{}; // Car -> Bus -> SchoolBus

class OpenCar extends Car{}; // Car -> OpenCar
class SportCar extends OpenCar{}; // Car -> OpenCar -> OpenCar


public class Example2 {
	public static void main(String[] args) {
		// 1차 상속관계가 아니더라도 자동 타입 변환이 된다.
		Car c1 = new SchoolBus();
		Bus b1 = new Bus();
		Bus b2 = new SchoolBus();
		
		Car c2 = new OpenCar();
		OpenCar oc = new SportCar();
		
		// 버스와 오픈카, 스포츠카는 상속관계가 아니기 때문에
		// 타입변환을 할 수 없다.
		// Bus b3 = new OpenCar(); // 자동타입변경 불가 상속관계가 아니기 때문
		// Bus b4 = new SportCar(); // 자동타입변경 불가 상속관계가 아니기 때문
	}
}
