package ex04_api;

public class Ex01_equals {
	public static void main(String[] args) {
		// 묵시적(암시적)객체 생성
		// 같은 문자열일때 이미 메모리에 올라가 있으면 참조를 해버린다.
		String str1 = "Hello";
		String str2 = "Hello";
		
		// 명시적 객체 생성 
		String str3 = new String("Hello");
		
		// 주소의 비교
		System.out.println("str1 vs str2 : " + (str1 == str2));
		System.out.println("str1 vs str3 : " + (str1 == str3));
		
		System.out.println("str1 hashcode : "+System.identityHashCode(str1));
		System.out.println("str2 hashcode : "+System.identityHashCode(str2));
		System.out.println("str3 hashcode : "+System.identityHashCode(str3));
		
		// 실제 값에 대한 비교
		System.out.println("str1 vs str2 : " + str1.equals(str2));
		System.out.println("str1 vs str2 : " + str1.equals(str3));
		
		// 얕은복사(shallow copy)
		// 주소를 복사해주기 때문에 원본값이 바뀌면 복사본도 바뀐다.
		
		str1 = "bye";
		System.out.println(str2);
		
		// 문자열의 불변(immutable)
		// 문자열의 값은 바뀌지 않는다.
		// 문자열을 수정하려고 할 때마다 메모리에 항상 새로운
		// 문자열 객체가 생성된다.
	}
}
