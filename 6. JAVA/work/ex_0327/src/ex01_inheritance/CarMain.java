package ex01_inheritance;

public class CarMain {
	public static void main(String[] args) {
		HybridWaterCar hwc = new HybridWaterCar();
		hwc.gasGauge = 20;
		hwc.electricGauge = 30;
		hwc.waterGauge = 30;
		hwc.showCurrentGauge();
		
	}
}
