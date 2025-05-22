package ex02_Thread;

public class RunnableMain {
	public static void main(String[] args) {
		Runnable task1 = () -> {
			for(int i = 0; i < 5; i++) {
				System.out.println("Thread 1 - i : " + i);
				try {
					Thread.sleep(1000); // 1초 대기해라
				} catch (Exception e) {
					
				}
			}
		};
		
		Runnable task2 = () -> {
			for(int i = 0; i < 5; i++) {
				System.out.println("Thread 2 - i : " + i);
				try {
					Thread.sleep(1000); // 1초 대기해라
				} catch (Exception e) {
					
				}
			}
		};
		
		Runnable task3 = () -> {
			for(int i = 0; i < 5; i++) {
				System.out.println("Thread 3 - i : " + i);
				try {
					Thread.sleep(1000); // 1초 대기해라
				} catch (Exception e) {
					
				}
			}
		};
		
		Thread thread1 = new Thread(task1);
		Thread thread2 = new Thread(task2);
		Thread thread3 = new Thread(task3);
		
		thread1.start();
		thread2.start();
		thread3.start();
		
		
	}
}
