package ex01_innerClass;

public class PersonMain {
	public static void main(String[] args) {
		Student s = new Student();
		s.myself();
		Person p = new Person() {
			@Override
			public void myself() {
				System.out.println("저는 회사원 입니다.");
			}
		};
	}
}
