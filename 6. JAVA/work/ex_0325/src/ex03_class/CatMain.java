package ex03_class;

// 클래스는 일반적으로 하나의 소스파일에 하나의 클래스를 선언
// 하나의 파일에서 여러개의 클래스를 선언한다면
// 파일이름과 같은 클래스에서만 public(접근제어자)을 붙힐 수 있다. 
class Dog{
	
}
// 코드를 컴파일한 결과물은 코드 파일을
// 각각 작성한 것과 동일하게 각 class별로 도출되어
// 2개가 생성된다.

// 파일 분리 여부와 상관없이 결과물이 같기 때문에
// 분리여부는 개발자가 원하는 대로 작성해도 무방하다.

// 그러나 추후 유지보수의 편리성과 클래스 재사용을 고려해
// 하나의 파일에 하나의 클래스를 작성하는 것을 추천한다.

public class CatMain {
	public static void main(String[] args) {
		// 객체 생성 방법
		// 1. 객체 변수 선언하기
		// 클래스명 객체명;
		Cat c;
		
		// 2. 객체변수에 객체 대입하기
		// 객체명 = new 클래스명();
		c = new Cat();
		
		// 객체가 heap영역에 올라가게 되고
		// 변수는 객체까지 접근할 수 있는 주소값을 갖는다.
		System.out.println(c);
	}
}
