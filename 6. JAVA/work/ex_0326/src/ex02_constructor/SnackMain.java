package ex02_constructor;

public class SnackMain {
	public static void main(String[] args) {
		// 생성자 : 특수한 기능을 가진 메서드다.
		// 메서드는 선언을 한 뒤 -> 호출
		// 우리는 생성자를 따로 선언한 적이 없다.
		Snack chip = new Snack(5000);
		// chip.price = 2000; // 생성자에서 직접 값을 선언하기 때문에 별도로 작성할 필요가 없다.
		chip.info();
		Snack fries = new Snack(3000);
		fries.info();
	}
}
