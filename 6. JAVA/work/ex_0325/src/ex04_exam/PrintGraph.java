package ex04_exam;

import java.util.Random;

public class PrintGraph {
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

	Random rand = new Random();
	public void PrintGraph(int[] x) {
		int[] count = new int[10];
		for(int i = 0 ; i < x.length; i++) {
			x[i] = rand.nextInt(10);
			count[x[i]]++;
		}
		for(int j = 0; j < 10; j++) {
		String r = "#"
				;
		System.out.println(j + "의 갯수 : " + r.repeat(count[j]) + " " + count[j]);
		}
	}
	
	public String print(char ch, int num) {
		char[] val = new char[num];
		String str = "";
		for(int i = 0; i < val.length; i++) {
			str += val[i] = ch;
		}
		return str;
	}
	
}
