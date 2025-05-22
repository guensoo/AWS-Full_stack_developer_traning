package ex01_innerClass;

import java.util.Set;

interface buttonClickListner{
	public void click();
}

public class AnonymousExample {
	public class Button{
		// buttonClickListener 타입의 변수를 가진다.
		// 인터페이스의 구현체는 다 들어올 수 있다.
		private buttonClickListner listener;
		
		// 멤버변수는 private로 지정하는 일이 많기 때문에 직접 접근하는 것이 불가능하다.
		// public으로 된 메서드를 통해서 접근 하는 경우가 많다.
		// setter & getter
		
		public void setListener(buttonClickListner listener) {
			this.listener = listener;
		}
		
		public void click() {
			if(listener != null) {
				this.listener.click();
			}
		}
	}
	
	public static void main(String[] args) {
		// 외부 클래스의 객체
		AnonymousExample exam = new AnonymousExample();
		// 내부 클래스의 객체(외부 클래스의 객체로부터 생성)
		AnonymousExample.Button button = exam.new Button();
		// ButtonImpl bi = new ButtonImpl();
		button.setListener(new buttonClickListner() {
			@Override
			public void click() {
				System.out.println("버튼 클릭됨");
			}
		});
		
		button.click();
	}
}
