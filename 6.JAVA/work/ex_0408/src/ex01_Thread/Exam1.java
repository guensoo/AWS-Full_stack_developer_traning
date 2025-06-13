package ex01_Thread;
// 스캐너를 이용하여 키보드에서 숫자를 입력받고
// 스레드에서 입력받은 숫자부터 1씩 감소하다가 0이 되었을 때
// "종료" 메시지와 함게 프로그램이 종료되도록 만들어보자
// Thread는 ThreadCount에다 작성하기

import java.util.Scanner;
class ThreadCount extends Thread{
	private int count;
	
	// 1. 생성자를 통해 받는다.
	public ThreadCount(int count){
		this.count = count;
	}
	
	// 2. setter를 통해 받는다.
	public void setCount(int count) {
		this.count = count;
	}
	
	// 값을 반환받고 싶으면 getter를 만든다.
	public int getCount() {
		return count;
	}
	
	@Override
	public void run() {
		System.out.println("카운트다운 "+count+"초");
		for(int i = count; i >= 0; i--) {
			try {
				Thread.sleep(1000);
				System.out.println(count);
				count--;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		System.out.println("종료");
	}
}
public class Exam1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("초를 입력해 주세요 : ");
		int count = sc.nextInt();
		ThreadCount tc = new ThreadCount(count);
		
		tc.start();
	}
	
}
