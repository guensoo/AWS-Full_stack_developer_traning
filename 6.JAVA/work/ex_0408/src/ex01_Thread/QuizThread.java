package ex01_Thread;

import java.util.Random;
import java.util.Scanner;

// QuizThread클래스를 만들어 스레드를 상속받는다.
// startGame()메서드를 만들고 그 안에서 1 ~ 100사이의 난수 두개를 더하는 문제를 출제
// 키보드에서 답을 입력하여 5문제가 정답처리 될 때까지 로직을 반복합니다.
// 모든 문제를 맞추는데 몇 초가 걸렸는지 화면에 출력하며 프로그램을 종료하기
public class QuizThread extends Thread{
	
	private int count;
	private int sec;
	
	public int getSec() {
		return sec;
	}
	
	public void setSec(int sec) {
		this.sec = sec;
	}
	
	public void startGame() {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 5;) {
			// 랜덤 난수 생성 1 ~ 100
			int x = r.nextInt(100)+1;
			int y = r.nextInt(100)+1;
			int plus = x+y;	
			while(true) {
				System.out.println("=== "+(i+1)+"번 문제 ===");
				System.out.printf("%d + %d =", x, y);
				int result = sc.nextInt();
				
				if(result > plus) {
					System.out.println("DOWN!!");
				}
				else if(result < plus) {
					System.out.println("UP!");
				}
				else {
					System.out.println("정답입니다!");
					i++;
					sec++;
					break;
				}
			}
		}
	}
	
	@Override
	public void run() {
		while(sec != 5) {
			try {
				Thread.sleep(1000);
				count++;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		System.out.println("해결시간 : "+count+"초");
	}
}
