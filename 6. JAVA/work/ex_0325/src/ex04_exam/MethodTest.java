package ex04_exam;

import java.util.Random;
import java.util.Scanner;

public class MethodTest {

	// 배열의 최대값을 찾는 maxFinder메서드
	// 임의의 배열은 매개변수로 받자.
	public void maxFinder(int[] arr) {
		int max = arr[0];
		for(int x : arr) {
			if(x > max) {
				max = x;
			}
		}
		System.out.println("최대값 : " + max);
	}
	
	// 원의 넓이와 둘레 구하기
	// 함수를 호출하면서 반지름을 받는다.
	// 원의 넓이를 구하는 circleArea
	// 원의 둘레를 구하는 circleRound
	// circleArea는 결과 출력하기
	// circleRound는 결과 반환하기
	// 원의 넓이 : 3.14*r*r
	// 원의 둘레 : 2*3.14*r;
	
	public void circleArea(int r) {
		System.out.println("원의 넓이 : " + 3.14 * r * r);
	}
	
	public double circleRound(int r) {
		return 2*3.14*r;
	}
	
	// 계산기 만들기
	// 사칙연산을 할 calculator 메서드 만들기
	// 두 수와 연산자를 매개변수로 받는다.
	
	public void calculator(int x, int y, char op) {
		switch(op) {
		case '+':
			System.out.printf("%d + %d = %d\n", x, y, (x + y));
			break;
		case '-':
			System.out.printf("%d - %d = %d\n", x, y, (x - y));
			break;
		case '*':
			System.out.printf("%d * %d = %d\n", x, y, (x * y));
			break;
		case '/':
			System.out.printf("%d / %d = %d\n", x, y, (x / y));
			break;
		}
	}
	
	// 1 ~ 50사이의 난수를 생성
	// main쪽에서 키보드를 통해 정수를 입력받는다.
	// check()메서드를 만들어서 사용자가 입력한 숫자를 판단.
	// 발생한 난수보다 크다면 DOWN! 작다면 UP!을 입력
	// 사용자가 입력한 숫자와 발생한 난수가 같을경우
	// 프로그램을 종료(몇회만에 맞췄는지 판단해보기)
	
	Random rd = new Random();
	int rand = rd.nextInt(50)+1;
	int cnt = 0;
	Scanner sc = new Scanner(System.in);
	int x;
	public void check() {
		System.out.print("값을 입력해 주세요 : ");
			outer:while(x != rand) {
				x = sc.nextInt();
				cnt++;
				if(x > rand) {
					System.out.println("DOWN!");
					continue outer;
				}else if(x < rand) {
					System.out.println("UP!");
					continue outer;
				}else if(x == rand) {
					System.out.println("정답입니다.");
					System.out.println("시도한 횟수 : "+cnt);
					break;
				}
			}	
	}
	
	int rnum = new Random().nextInt(50)+1;
	int count = 1;
	
	// 사용자가 입력한 숫자와 난수를 체크하는 기능
	public String check(int number) {
		if(number == rnum) {
			return "정답!";
		} else if(number> rnum) {
			return "Down!";
		} else {
			return "UP!";
		}
	}
	
// Graph라는 이름의 메인 클래스를 만들어 
// 0 ~ 9사이의 난수를 100개 저장하는 배열을 만들고, 
// 해당 배열이 가지고 있는 각 방의 난수를 판별하여 그래프화 해 보자.
// 단, 발생한 난수의 그래프화 작업은 PrintGraph클래스가 하도록 한다.

//  결과:
//  0507...... //난수 100개
//  0의 갯수 : ############ 12
//  1의 갯수 : ######### 9
//  2의 갯수 : ########### 11
//  3의 갯수 : ######## 8
//  4의 갯수 : ############## 14
//  5의 갯수 : ####### 7
//  6의 갯수 : ######### 9
//  7의 갯수 : ############# 13
//  8의 갯수 : ####### 7
//  9의 갯수 : ########## 10
	
	
	
}
