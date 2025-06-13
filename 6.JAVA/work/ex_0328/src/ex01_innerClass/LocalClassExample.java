package ex01_innerClass;

public class LocalClassExample {
	private int speed = 10;
	
	public void getUnit(String unitName) {
		
		// unitName = unitName+"님";
		
		class Unit{
			public void move() {
				System.out.println(unitName+"이 "+speed+"속도로 이동합니다.");
			}
		}
		
		Unit unit = new Unit();
		unit.move();
	}
	
	public static void main(String[] args) {
		LocalClassExample local = new LocalClassExample();
		local.getUnit("마린");
	}
	
	// 지역 내부 클래스를 사용하는 이유
	// 1. 클래스를 외부로 뺄 필요 없이, 한정된 범위 내에서만 잠깐 사용할 때
	// - 재사용성이 없고, 해당 메서드에만 사용하는 클래스라면, 외부에 클래스를
	// 선언하지 않아도 돼서 코드가 간결해짐
	// 2. 상태나 기능이 조금 있는 일시적인 도우미 객체가 필요할 때
	// - 단순 변수, 함수로는 부족할 때
	// - 일회성 객체에 상태 / 기능을 동시에 담고 있을 때
	
}
