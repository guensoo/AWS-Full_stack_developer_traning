package ex01_Thread;

// 창고 클래스
public class Storage {
	
	// 재고
	private int stackCount = 10;
	
	// 물건을 쌓는 메서드
	public synchronized void addStack(int stackCount) {
		this.stackCount += stackCount;
		// 쌓은 물건이 10개 이상이면
		if(this.stackCount >= 10) {
			System.out.println("== 스레드 깨우기 ==");
			notify(); // 스레드를 깨워서 물건을 날라라
		}
	}
	
	public synchronized void popStack(int leaveCount) {
		// 나르려는 양이 재고보다 많으면
		if(leaveCount > stackCount) {
			stackCount = 0;
		} else {
			stackCount -= leaveCount;
		}
		if(stackCount == 0) {
			System.out.println("== 짐 없음 대기 ==");
			try {
				wait(); // 스레드가 진행중에 wait()을 만나면 일시적으로 정지
				System.out.println("== 대기끝 일 시작 ==");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	// 재고 개수 확인 getter
	public int getStackCount() {
		return stackCount;
	}
}
