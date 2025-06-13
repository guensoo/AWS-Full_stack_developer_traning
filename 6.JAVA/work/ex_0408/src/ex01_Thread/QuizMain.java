package ex01_Thread;

public class QuizMain {
	public static void main(String[] args) {
		QuizThread qt = new QuizThread();
		qt.start();
		qt.startGame();
	}
}
