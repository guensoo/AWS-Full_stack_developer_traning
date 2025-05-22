package ex04_exam;

import java.util.Scanner;

public class MethodMain {
	public static void main(String[] args) {
		MethodTest mt = new MethodTest();
		
		int[] arr = {1,2,3,4,5};
		
		mt.maxFinder(arr);
		
		int x = 3;
		mt.circleArea(x);
		
		System.out.print(mt.circleRound(x));
		
		System.out.println();
		
		mt.calculator(2, 4, '+');
		
		Scanner sc = new Scanner(System.in);
		mt.check();
		
		
		
	}
}
