package ex02_lamda;

public class Ex01_Function {
	public static int result(Iadd lamda) {
		return lamda.add(1, 2);
	}
	public static void main(String[] args) {
		Iadd add = (x,y) -> x+y;
		int res = result(add);
		System.out.println("res : "+res);
	}
	
	
}
