package ex02_iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Bingo {
	public static void main(String[] args) {
		// HashSet을 이용한 5 * 5의 랜덤 빙고판 만들기
		Random r = new Random();
		HashSet<Integer> set = new HashSet<>();
		
		int[][] board = new int [5][5];
		
		// HashSet에 25개의 난수를 채울때까지 돌려라
		while(set.size() != 25) {
			int x = r.nextInt(50)+1;
			set.add(x);
		}
			
			// Set은 index가 없기 때문에 하나씩 꺼낼수가 없다.
			// 그렇기 때문에 iterator를 통해서 꺼낸다.
			
			// shuffle(List)
			List<Integer> list = new ArrayList<>(set);
			Collections.shuffle(list);
			// set으로 랜덤값을 넣었기 때문에 중복값은 어차피 안들어가있음
			

			Iterator<Integer> iter = list.iterator();
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				board[i][j] = iter.next();
				System.out.printf("%02d ", board[i][j]);
			}
			System.out.println();
		}
		
	}
}
