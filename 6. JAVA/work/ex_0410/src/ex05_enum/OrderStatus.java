package ex05_enum;

public enum OrderStatus {
	ORDERED{
		@Override
		OrderStatus next() {
			return SHIPPED;
		}
	}, SHIPPED{
		@Override
		OrderStatus next() {
			return DELIVERED;
		}
	}, DELIVERED {
	      @Override
	      OrderStatus next() throws Exception {
	         throw new Exception("더 이상 상태를 전환할 수 없습니다.");
	      }
	   };
	   
	   abstract OrderStatus next() throws Exception;
	
	
}
	// 온라인 쇼핑몰의 주문상태를 관리하는 시스템을 만들고자 한다.
	// 상태에 따라 다음 상태로 바뀐다.
	// 각 상태에서 next()메서드를 호출하면 다음상태로 전환되도록 구현하기
	// ORDERED -> SHIPPED
	// SHIPPED -> DELIVERED
	// DELIVERED -> "완료상태이며 상태 전환 불가"
	
	// OrderStatus status = OrderStatus.ORDERED;
	// status = status.next(); // SHIPPED
	// status = status.next(); // DELIVERED
	// status = status.next(); // 예외발생
	
	
	

