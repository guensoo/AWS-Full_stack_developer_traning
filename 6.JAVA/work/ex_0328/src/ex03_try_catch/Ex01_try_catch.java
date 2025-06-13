package ex03_try_catch;

public class Ex01_try_catch {
	public static void main(String[] args) {
		int result = 0;
		try {
			// 예외가 발생할 수 있는 확률이 있는 코드
			result = 10/0;
			System.out.println("나누기 결과 : "+result);
		} catch (Exception e) {
			// 예외가 발생했을 때 어떻게 처리할거냐
			System.out.println("정수는 0으로 나눌 수 없습니다.");
		}
		System.out.println("프로그램 종료");
	}
}
