package ex01_inheritance;

public class HybridWaterCar extends HybridCar{
	int waterGauge;
	@Override
	public void showCurrentGauge() {
		System.out.println("가스 잔여량 : " + gasGauge);
		System.out.println("잔여 가스량 : "+electricGauge);
		System.out.println("잔여 물양 : "+waterGauge);
	}

}
