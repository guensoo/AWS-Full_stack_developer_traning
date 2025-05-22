package ex02_class_casting;

public class BikeMain {
	public static void main(String[] args) {
		Bike b = new FourWheelBike("길동");
		b.info();
		b.ride();
		// b.addWheel(); // 에러발생 부모타입으로는 접근이 불가능
		
		// 자식 타입으로 다시 변환을 해줌으로써 부모 타입에서는 사용하지 못했던
		// 자식의 멤버들을 모두 사용할 수 있게 되었다.
		FourWheelBike fwb = (FourWheelBike)b;
		fwb.addWheel();
		fwb.info();
		fwb.ride();
		
		Bike b2 = new Bike("길동2");
		FourWheelBike fwb2 = (FourWheelBike)b2;
	}
}
