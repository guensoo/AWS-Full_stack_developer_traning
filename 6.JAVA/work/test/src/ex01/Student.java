package ex01;

//6. '학생' 클래스를 작성하고, '이름', '나이', '학번'을 인스턴스 변수로 가지며 이를 출력하는 메서드를 작성하세요.
public class Student {
	String name;
	int age;
	int id;
	
	public Student(String name, int age, int id) {
		this.name = name;
		this.age = age;
		this.id = id;
	}
	
	// 4. 25.(금) 시험 후
	// 메서드 왜 안만들었니 근수근수야...........
	public String info() {
		return "이름: " + name + ", 나이: " + age + ", ID: " + id;
	}
	
	// 또는 
	public void studentInfo() {
	    System.out.printf("이름 : %s, 나이 : %d, 학번 : %d", name, age, id);
	}
}
