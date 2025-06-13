package ex01_innerClass;

public class PermitExample {
	private class InClass{
		public void print() {
			System.out.println("접근을 private으로 제한한다.");
		}
	}
	
	public InClass getInClass() {
		return new InClass();
	}
	
	public static void main(String[] args) {
		PermitExample permit = new PermitExample();
		// InClass가 private이라서 내부클래스의 객체를
		// 직접 만들 수 없다.
		// PermitExample.InClass = permit.new InClass();
		
		permit.getInClass().print();
	}
}
