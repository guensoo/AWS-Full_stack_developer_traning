package ex01_Quiz;

import java.util.HashMap;
import java.util.Map;

public class Student {
//	클래스 이름: Student
//	필드: 이름(String), 나이(int)
//	생성자: 이름과 나이를 매개변수로 받아 초기화
//	printInfo() 메서드: “이름: 홍길동, 나이: 20세” 형태로 출력
		String name;
		int age;
		public void setName(String name) {
			this.name = name;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public void printInfo() {
			System.out.println("이름 : "+name+ ", 나이 : " + age + "세");
		}
		public static void main(String[] args) {
			Student s = new Student();
			s.setName("홍길동");
			s.setAge(20);
			s.printInfo();
		}
}
