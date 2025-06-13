package ex03_variable;

public class Ex02_variable {
	public static void main(String[] args) {
		// 변수의 유효범위(scope)
		// 모든 변수는 만들어진 중괄호 안에서만 사용할 수 있다.
		String favoriteFood;
		
		if(10 > 5) {
			favoriteFood = "제육";
			// 바깥에서 안쪽으로는 가능 하지만 안쪽에서 바깥쪽으로는 불가능하다.
		}
	}
	// favoriteFood = "제육"; // 에러 발생 유효범위 밖에서 사용했기 때문
}
