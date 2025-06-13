package ex04_overloading;

public class Bread {
	// 각기 다른 기능을 하는 makeBread() 메서드를 세개 만드는데,
	// 메인클래스에서 각각의 메서드를 호출했을 때의 결과를 보고 로직을 구현해 보자

	String s;
	int num;
	
	// 빵을 만들었습니다 <------------------ method 1을 호출해서 나온 결과
	// --------------
	public void make() {
		System.out.println("빵을 만들었습니다");
		System.out.println("------------");
	}
	
	// 빵을 만들었습니다 <------------------ method 2을 호출해서 나온 결과
	// 빵을 만들었습니다.
	// 요청하신 n개의 빵을 만들었습니다.
	// --------------
	public void make(int n) {
		this.num = n;
		for(int i = 0; i < num; i++) {
			System.out.println("빵을 만들었습니다");
		}
		System.out.println("요청하신 "+num+"개의 빵을 만들었습니다.");
		System.out.println("------------");
	}
	
	// 크림빵을 만들었습니다 <------------------ method 3을 호출해서 나온 결과
	// 크림빵을 만들었습니다.
	// 요청하신 n개의 빵을 만들었습니다.
	public void make(String s, int n) {
		this.s = s;
		this.num = n;
		for(int i = 0; i < num; i++) {
			System.out.println(s+"빵을 만들었습니다.");
		}
		System.out.println("요청하신 "+num+"개의 빵을 만들었습니다.");
		System.out.println("------------");
	}
}
