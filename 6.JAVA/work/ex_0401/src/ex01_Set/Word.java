package ex01_Set;

import java.util.HashSet;
import java.util.Scanner;

public class Word {
	public static void main(String[] args) {
		// 사용자가 입력한 문장에서 단어가 중복되었는지 검사하기
		// 예시
		// I love Java and I love coding
		// 중복단어 있음
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문장을 입력해주세요 : ");
		String input = sc.nextLine();
		
		String[] words = input.split(" ");//"I love Java I love coding"
		
		HashSet<String> wordSet = new HashSet<String>();
		
		boolean hasDuplicate = false;
		
		// boolean add(E e)
		// 잘 들어갔으면 true 중복되면 false를 반환
		for(String word : words) {
			if(!wordSet.add(word)) {
				hasDuplicate = true;
				break;
			}
		}
		if(hasDuplicate) {
		System.out.println("중복 단어 있음!!");
		} else {
			System.out.println("중복 단어 없음!!");
		}
		
	}
}
