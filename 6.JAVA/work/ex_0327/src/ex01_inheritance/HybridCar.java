package ex01_inheritance;

public class HybridCar extends Car{
	int electricGauge;
	
	@Override
	public void showCurrentGauge() {
		System.out.println("잔여 가스량 : "+gasGauge);
		System.out.println("잔여 가스량 : "+electricGauge);
	}
}
