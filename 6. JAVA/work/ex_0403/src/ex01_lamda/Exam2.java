package ex01_lamda;

import java.util.ArrayList;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

class Greeting{
	   private String name;
	   
	   
	   public Greeting(String name) {
	      this.name = name;
	   }
	   
//	   public void test (String name) {
//		   this.name = name;
//	   }
	   
//	   public void Greeting2(String name) {
//		   this.name = name;
//	   }
	   public String sayHello() {
	      return "hello, " + name;
	   }
	}

class Student{
	private int score;
	
	public Student(int score) {
		this.score = score;
	}
	
	public boolean isPassed(int cutLine) {
		return score >= cutLine;
	}
}

public class Exam2 {
	public static void main(String[] args) {
		// Greeting 메서드를 참조하여 sayHello() 호출하기
		Function<Greeting, String> g = Greeting::sayHello;
		Greeting g2 = new Greeting("홍길동");
//		Greeting g2 = new Greeting();
//		g2.test("홍길동");
		System.out.println(g.apply(g2));
		
		// 학생이 특정 점수 이상인지 확인하는 메서드를 메서드 참조로 구하기
		
		
//		boolean passed = cut.test(s1);
//		Function<Student, Boolean> pass = Student::isPassed;
		BiPredicate<Student, Integer> passChecker = Student::isPassed;
		Predicate<Integer> cut = x -> x >= 60;
		Student s1 = new Student(85);
		System.out.println(passChecker.test(s1, 70));
//		System.out.println(cut.test(s1));
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		// removeIf()
		// 조건에 맞으면 삭제해라
		list.removeIf(x -> x % 2 == 0);
		
		System.out.println(list);
		
	}
}
