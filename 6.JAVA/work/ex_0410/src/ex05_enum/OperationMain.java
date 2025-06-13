package ex05_enum;

public class OperationMain {
	public static void main(String[] args) {
		
		int x = 9;
		int y = 3;
		
		
		for(Operation op : Operation.values()) {
			System.out.println(op+" : " + op.apply(x, y));
		}
		
	}
}
