package ex05_enum;

public class OrderStatusMain {
	public static void main(String[] args) {
		OrderStatus status = OrderStatus.ORDERED;
		
		try {
			System.out.println("현재 상태 : " + status);
			status = status.next();
			System.out.println("현재 상태 : " + status);
			status = status.next();
			System.out.println("현재 상태 : " + status);
			status = status.next();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
	}
}
