package ex04_array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) {
		int[] iArr = new int[10];
		// 배열에 각각의 index에 1 ~ 10를 할당하고
		// 총 합을 구하여 출력하세요
//		iArr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int sum = 0;
		for(int i = 0; i < iArr.length; i++) {
			
			iArr[i] = i+1;
			sum += iArr[i];
			System.out.println(iArr[i]);
			
		
			
		}
		System.out.println();
		
		System.out.println(sum);
		
		System.out.println();
		
		Random r = new Random();
		// r.nextInt();
		
		// iArr에 각 index에 난수를 넣고
		// 배열의 짝수 요소들의 총 합 구하기
		sum = 0;
		for(int i = 0; i < iArr.length; i++) {
			int j = r.nextInt(30)+1;
			iArr[i] = j;
			System.out.printf("%d번째 배열의 값 : %d\n", i, iArr[i]);
			if(iArr[i] % 2 == 0) {
				sum += iArr[i];
			}
		}
		System.out.printf("짝수의 총 합 : %d", sum);
		
		System.out.println();
		
		int[] nums = {5,7,2,9,4,10,3};
		// 배열에서 최대값과 최소값을 출력하는 프로그램 만들기
		int max = nums[0];
		int min = nums[0];
		for(int i = 0; i < nums.length;) {
			if(nums[i] >= max) {
				max = nums[i];
			} 
			i++;
		}
		System.out.println(max);
		
		
		// TODO 최소값 다시풀어보기
		for(int i = 1; i < nums.length;i++) {
			for(int j = 0; j < nums[i]; j++) {
				if(nums[i] < min) {
					min = nums[i]; 
				}
			}
			
		}
		System.out.println(min);
		
//		for(int i = 0; i < nums.length; i++) {
//			if(nums[i] > max) max = nums[i];
//			if(nums[i] < max) max = nums[i];
//		}
		
		System.out.println("-----------------------------");
		// TODO 다시 풀어보기
		int[] nums2 = {1, 2 ,1, 3, 2, 1, 4};
		// 위 배열에서 각 숫자가 몇 번 나왔는지 출력하시오
		// 1 : 3번
		// 2 : 2번
		// 3 : 1번
		// 4 : 1번
		
		int cnt = 0;
		for(int i = 0; i < nums2.length; i++) {
			for(int j = nums2.length; j > i; j--) {
				if(nums2[j-1] == i) {
				cnt++;
				}
			}
			System.out.printf("%d : %d번\n", i, cnt);
		}
		System.out.println();
		
		int[] count = new int [5];
		
		for(int i = 0; i < nums2.length; i++) {
			count[nums2[i]]++;
		}
		for(int i = 1; i <= 4; i++) {
			System.out.printf("%d : %d번\n", i, count[i]);
		}
		
		System.out.println("-----------------------------------------");
		
		int[] nums3 = {5, 3, 8, 4, 2};
		// 오름차순으로 정렬
		
		max = 0;
		
		// TODO 다시 풀어보기
		// 1. 버블정렬
		// 인접한 두 요소를 비교해 큰 값을 뒤로 보내는 정렬 방식
		for(int i = 0; i < nums3.length; i++) {
			for(int j = 0; j < nums3.length -1 -i; j++) {
				if(nums3[j] > nums[j+1]) {
					int temp = nums[j];
					nums3[j] = nums3[j+1];
					nums3[j+1] = temp;
				}
			}
		}
		
		char[] card = {'1', 'L', 'O', '2', 'V', '3', 'E'};
		String myWorld = "";
		for(int i = 0; i < card.length; i++) {
			String a = "65";
			if(card[i] >= (char)65) {
				myWorld += card[i];
			}
			
		}
		System.out.println(myWorld);
		// TODO 다시 풀어보기
		// 키보드에서 배열의 길이를 입력받는다.
		// 입력받은 배열의 길이만큼 알파벳을 넣고 출력한다.
		// 배열의 길이 : 5
		// ABCDE
		
		// 배열의 길이 : 3
		// ABC
		
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의길이 : ");
		int x = sc.nextInt();
		char [] arr = new char[x];
		char c = 'A';
		for(int i = 0; i < arr.length; i++) {
			System.out.print(c);
			c++;
		}
		// TODO 다시 풀어보기
		// 동전의 개수 구하기
		// 10 ~ 5000 사이의 난수를 변수에 담는다
		// 1의 자리는 반드시 0이 되도록 한다.
		// 발생된 난수를 각 동전으로 바꿀 때 몇개씩 필요한지
		// 판단하여 작성하세요
		// 간으한 적은 수의 동전을 사용한다.
		
		// 4170
		// 500원 : 8개
		// 100원 : 1개
		// 50원 : 1개
		// 10원 2개
		
		Random rnd = new Random();
		int[] coin = {500, 100, 50, 10};
		int money = r.nextInt(500)+1;
		money *= 10;
		for(int i = 0; i < coin.length;) {
			System.out.println("금액 : " + money);
			int five = money / coin[i];
			money = money % coin[i];
			i++;
			int hund = money / coin[i];
			money = money % coin[i];
			i++;
			int fift = money / coin[i];
			money = money % coin[i];
			i++;
			int ten = money / coin[i];
			money = money % coin[i];
			System.out.println("필요한 돈 오백원 : " + five);
			System.out.println("필요한 돈 백원 : "+ hund);
			System.out.println("필요한 돈 오십원 : "+ fift);
			System.out.println("필요한 돈 십원 : " + ten);
			break;
		}
		
//		System.out.println("금액 : "+money);
//		for(int i = 0; i < coin.length; i++) {
//			int res = money / coin[i];
//			System.out.printf("%d원 : %d\n", coin[i], res);
//			money %= coin[i];
//		}
		
		// 로또번호 생성하기
		// 1 ~ 45 사이의 난수를 발생시켜 로또번호를
		// 생성하는 프로그램 만들기
		int [] iArr1 = new int[6];
		reset:for(int i = 0; i < iArr1.length;) { 
			iArr1[i] = r.nextInt(45)+1;
			for(int j = 0; j < i; j++) {
				if(iArr1[i] == iArr[j]) {
					continue reset;
				}
			}
			i++;
		}
		System.out.println(Arrays.toString(iArr1));
		
		
		// 로또번호 생성기
		// 1. 1 ~ 45사이의 난수를 추출한다.
		// 2. 배열에 넣는다.
		// 3. 배열의 다른 값들과 비교하여 중복되면 다시 뽑는다.
		
		int [] lotto = new int[6];
		outer:for(int i = 0; i < lotto.length;) {
			lotto[i] = r.nextInt(45)+1; // 난수 생성하여 배열에 넣기
			// 배열에서 중복값을 찾는 반복문
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					continue outer;
				}
				
			}
			System.out.println(lotto[i] + " ");
			i++;
			
		}
		
		
		
	}
}
		
